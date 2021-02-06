package BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            //创建一个serversocket实例
            ServerSocket serverSocket = new ServerSocket();

            //绑定端口
            serverSocket.bind(new InetSocketAddress(9999));
            System.out.println("服务端创建成功");

            //监听客户端连接
            Socket socket = serverSocket.accept();

            //读写操作
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream = socket.getOutputStream();
            //将客户端发送给服务端的数据打印并回写给客户端 循环接收，客户端发送exit表示结束
            String msg = reader.readLine();
            while ((msg != null) && ! "exit".equals(msg)) {
                System.out.println("客户端数据："+msg);
                //将数据回写给客户端
                String info = "[echo]:"+msg+"\n";
                outputStream.write(info.getBytes());

                //重复接收客户端消息
                msg = reader.readLine();
            }

            System.out.println("客户端发送结束指定");

            //关闭资源
            socket.close();
            serverSocket.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}