package 锁;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyReentrantLock extends Thread{
    private static int index =1;
    private static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() + "：" + index++);
            }
        }finally {
            lock.unlock();
        }
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyReentrantLock t1 = new MyReentrantLock();
        MyReentrantLock t2 = new MyReentrantLock();
        MyReentrantLock t3 = new MyReentrantLock();
        MyReentrantLock t4 = new MyReentrantLock();
        MyReentrantLock t5 = new MyReentrantLock();
        MyReentrantLock t6 = new MyReentrantLock();
        MyReentrantLock t7 = new MyReentrantLock();
        MyReentrantLock t8 = new MyReentrantLock();
        MyReentrantLock t9 = new MyReentrantLock();
        MyReentrantLock t10 = new MyReentrantLock();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}
