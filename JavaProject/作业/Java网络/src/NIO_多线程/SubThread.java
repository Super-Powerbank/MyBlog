package NIO_多线程;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class SubThread extends Thread {
    private SocketChannel socketChannel;
    private Selector selector;
    private ByteBuffer buffer;

    public SubThread(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
        try {
            this.selector = Selector.open();
            this.socketChannel.configureBlocking(false);
            this.socketChannel.register(selector, SelectionKey.OP_READ);
            buffer = ByteBuffer.allocate(1024);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            //关注读事件
            while (selector.select() > 0) {
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();

                    if (!selectionKey.isValid()) continue;
                    if (selectionKey.isReadable()) {
                        SocketChannel channel = (SocketChannel) selectionKey.channel();

                        //读数据
                        buffer.clear();
                        int read = channel.read(buffer);
                        if (read == -1) {
                            //表示客户端发送完数据
                            channel.close();
                            break;
                        }

                        //读写切换
                        buffer.flip();

                        byte[] bytes = new byte[buffer.remaining()];

                        buffer.get(bytes);

                        String msg = new String(bytes);
                        System.out.println("Thread:" + Thread.currentThread().getName() + "处理用户：" + channel.getRemoteAddress() + ",数据：" + msg);

                        //给客户端发送数据
                        buffer.clear();

                        String recv = "[echo]:" + msg + "\n";
                        buffer.put(recv.getBytes());

                        //读写模式切换
                        buffer.flip();

                        channel.write(buffer);

                        if ("exit".equals(msg)) {
                            channel.close();
                            break;
                        }

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
