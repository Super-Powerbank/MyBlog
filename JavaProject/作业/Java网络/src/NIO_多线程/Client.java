package NIO_多线程;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            Selector selector = Selector.open();

            if (!socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999))){
                socketChannel.register(selector,SelectionKey.OP_CONNECT);

                selector.select();
                Iterator <SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();

                    if (selectionKey.isConnectable()) socketChannel.finishConnect();
                }
            }
            Scanner scanner = new Scanner(System.in);
            String msg = null;
            socketChannel.register(selector,SelectionKey.OP_READ);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while ((msg =scanner.nextLine()) != null) {
                buffer.clear();

                msg +="\n";
                buffer.put(msg.getBytes());
                buffer.flip();

                socketChannel.write(buffer);
                selector.select();

                Iterator <SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();

                    if (selectionKey.isReadable()) {
                        SocketChannel channel = (SocketChannel) selectionKey.channel();

                        ByteBuffer allocate = ByteBuffer.allocate(1024);
                        channel.read(allocate);

                        allocate.flip();

                        byte[] bytes = new byte[allocate.remaining()];

                        allocate.get(bytes);
                        String recv = new String(bytes);
                        System.out.println(recv);
                    }
                }
                if ("exit".equals(msg)) {
                    break;
                }


            }
            selector.close();
            socketChannel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
