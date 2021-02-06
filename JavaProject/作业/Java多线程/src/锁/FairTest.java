package 锁;

import java.util.concurrent.locks.ReentrantLock;

public class FairTest implements Runnable {
    private ReentrantLock lock = new ReentrantLock(true);


    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName());
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        FairTest fairTest = new FairTest();

        Thread thread1 = new Thread(fairTest, "线程A");
        Thread thread2 = new Thread(fairTest, "线程B");

        thread1.start();
        thread2.start();

    }

}