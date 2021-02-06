package BIO_多线程;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MutilThreadServe {
    public static void main(String[] args) {
        try {
            //创建实例ServerSocket
            ServerSocket serverSocket = new ServerSocket();

            //绑定端口
            serverSocket.bind(new InetSocketAddress(9999));
            System.out.println("服务端启动啦");

            //接口客户端的连接
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("客户端："+socket.getRemoteSocketAddress()+" 连接上啦");

                //将socket实例交给子线程处理
                new Thread(new MutilThread(socket)).start();
            }

            //并没有将serverSocket资源关闭操作


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}