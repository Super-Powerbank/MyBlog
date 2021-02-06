package BIO_多线程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class MutilThread implements Runnable{
    private Socket socket;
    public MutilThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //读写操作
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream = socket.getOutputStream();

            String msg = null ;

            while ((msg = reader.readLine()) != null) {
                System.out.println("线程："+Thread.currentThread().getName()+"接收客户端："+socket.getRemoteSocketAddress()+"消息："+msg);

                //回复消息
                String recv = "【echo】"+msg+"\n";
                outputStream.write(recv.getBytes());

                if ("exit".equals(msg)) break;
            }

            //关闭资源
            System.out.println("线程："+Thread.currentThread().getName()+" 客户端："+socket.getRemoteSocketAddress()+"退出");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
