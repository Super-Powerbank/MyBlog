package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Server {
    public static void main(String[] args) {
        //创建服务端ServerSocketChannel实例
        ServerSocketChannel serverSocketChannel;
        {
            try {
                serverSocketChannel = ServerSocketChannel.open();

                //绑定端口
                serverSocketChannel.bind(new InetSocketAddress(6666));
                System.out.println("服务端启动啦");

                //监听

                //设置serverSocketChannel为非阻塞
                serverSocketChannel.configureBlocking(false);

                //创建selector复用器
                Selector selector = Selector.open();

                //将监听事件注册到复用器上
                serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

                //等待系统返回已完成的事件
                //select()本身是会阻塞，等系统告诉用户空间那些事件已经准备就绪，返回结果表示已准备完成的事件个数

                while (selector.select() > 0) {
                    //感兴趣事件集合（指的就是注册到selector中的事件）
                    Set<SelectionKey> selectionKeys = selector.selectedKeys();
                    Iterator<SelectionKey> iterator = selectionKeys.iterator();
                    while (iterator.hasNext()) {
                        SelectionKey selectionKey = iterator.next();
                        //删除掉已经完成的事件
                        iterator.remove();
                        if (selectionKey.isAcceptable()) {
                            //当前是可接收事件已经准备就绪
                            ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) selectionKey.channel();

                            //接收客户端连接,返回一个SocketChannel实例表示是客户端的连接
                            SocketChannel socketChannel = serverSocketChannel1.accept();
                            System.out.println("客户端连接上");

                            //设置SocketChannel实例为非阻塞
                            socketChannel.configureBlocking(false);

                            //将SocketChannel注册到复用器上，并关注读事件
                            socketChannel.register(selector, SelectionKey.OP_READ);
                        }

                        if (selectionKey.isReadable()) {
                            //当前有可读事件发生
                            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();

                            //读数据
                            ByteBuffer buffer = ByteBuffer.allocate(1024);
                            //往Buffer中写数据
                            int read = socketChannel.read(buffer);
                            if (read == -1) {
                                //客户端已经关闭
                                socketChannel.close();
                                continue;
                            }
                            //进行读写模式的切换
                            buffer.flip();

                            byte[] bytes = new byte[buffer.remaining()];
                            //读取buff数据
                            buffer.get(bytes);
                            //接收数据
                            String msg = new String(bytes);

                            System.out.println("客户端：" + socketChannel.getRemoteAddress() + " 发送数据" + msg);


                            String recv = "[echo]:" + msg;
                            //回复消息

                            //先将Buffer清空
                            buffer.clear();

                            //往Buffer写数据
                            buffer.put(recv.getBytes());

                            //读写模式切换
                            buffer.flip();
                            //将Buffer数据读到channel通道
                            socketChannel.write(buffer);

                            //业务断开
                            if ("exit".equals(msg)) {
                                socketChannel.close();
                            }
                        }
                    }
                }

                //来轮序是什么事件完成


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}