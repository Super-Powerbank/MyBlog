package BIO_多线程;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        //创建socket实例
        Socket socket = new Socket();

        Scanner scanner = new Scanner(System.in);
        try {
            //连接服务器
            socket.connect(new InetSocketAddress("127.0.0.1",9999));


            OutputStream outputStream = socket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("客户端启动成功");
            //给服务端发送数据
            while (scanner.hasNext()) {

                String msg = scanner.nextLine();
                System.out.println("发送消息："+msg);
                //
                outputStream.write((msg+"\n").getBytes());
                String recv = reader.readLine();
                System.out.println(recv);

                //如果是exit 则退出
                if ("exit".equals(msg)) break;
            }

            //关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
