package 守护线程;

import java.util.concurrent.TimeUnit;

public class TestDemo {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        TimeUnit.MILLISECONDS.sleep(1);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //将子线程变为守护线程
//        thread.setDaemon(true);//在线程启动之前去调用
        thread.start();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Finished");
    }
}