package 锁;


import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {

    public synchronized void test1() {
        //获取MyThread类当前this引用的对象锁
        int i = 5;
        while (i >= 1) {
            System.out.println(Thread.currentThread().getName() + ":" + i--);
            try {
                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void test2() {
        synchronized (MyRunnable.class) {
            //获取当前MyRunnable类中class对象的对象锁
            int i = 5;
            while (i >= 1) {
                System.out.println(Thread.currentThread().getName() + ":" + i--);
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
//        test1();
        test2();
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread threadA = new Thread(myRunnable, "线程A");
        Thread threadB = new Thread(myRunnable, "线程B");
        threadA.start();
        threadB.start();
    }
}
