package NIO_多线程;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class MutilThreadServer {
    public static void main(String[] args) {
        //获取ServerSocketChannel实例
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();


            serverSocketChannel.bind(new InetSocketAddress(9999));
            System.out.println("主线程已启动");

            serverSocketChannel.configureBlocking(false);

            //复用器
            Selector selector = Selector.open();

            serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);


            //循环监听
            while (selector.select() > 0) {
                Iterator <SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();
                    if (!selectionKey.isValid()) continue;

                    if (selectionKey.isAcceptable()) {

                        ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) selectionKey.channel();
                        SocketChannel socketChannel = serverSocketChannel1.accept();
                        System.out.println("Thead:"+Thread.currentThread().getName()+",新用户连接："+socketChannel.getRemoteAddress());

                        //将socketChannel交给子线程进行读写处理
                        new SubThread(socketChannel).start();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}