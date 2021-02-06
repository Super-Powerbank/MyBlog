package 锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockTest {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final TryLockTest test = new TryLockTest();
        //t0 先拿到锁
        new Thread() {
            public void run() {
                test.insert(Thread.currentThread());//Thread.currentThread() 获取当前正在运行的线程
            }
        }.start(); //thread 0


        Thread t1 = new Thread() {
            public void run() {
                test.insert(Thread.currentThread());
            }
        };
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
    }

    public void insert(Thread thread) {
        try {
            if (lock.tryLock(7, TimeUnit.SECONDS)) { //尝试加锁，如果获取成功。如果获取失败则等待7秒
                try {
                    System.out.println(thread.getName() + "得到了锁");
                    TimeUnit.SECONDS.sleep(5);
                } catch (Exception e) {
                    // TODO: handle exception
                } finally {
                    System.out.println(thread.getName() + "释放了锁");
                    lock.unlock();
                }
            } else {
                System.out.println(thread.getName() + "获取锁失败");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
