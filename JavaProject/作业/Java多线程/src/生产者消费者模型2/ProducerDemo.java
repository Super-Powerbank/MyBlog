package 生产者消费者模型2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者
 */
public class ProducerDemo extends Thread {
    private LinkedList<Integer> C;
    private ReentrantLock lock;
    private Condition proCondition;
    private Condition cumCondition;
    private Random random = new Random();

    public ProducerDemo(LinkedList<Integer> c, ReentrantLock lock, Condition proCondition, Condition cumCondition) {
        C = c;
        this.lock = lock;
        this.proCondition = proCondition;
        this.cumCondition = cumCondition;
    }

    @Override
    public void run() {

        while (true) {
            //生产者线程 阻塞
            lock.lock();
            try {
                //判断仓库是否满了，满了则阻塞
                while (C.size() == 5) {
                    try {
                        System.out.println("仓库已满，生产者线程阻塞");
                        proCondition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int count = random.nextInt(1000);
                System.out.println("生产者线程往仓库放数据：" + count);
                try {
                    Thread.sleep(count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //将生产数据放入仓库
                C.addLast(count);
                //通知消费者
                cumCondition.signalAll();
            } finally {
                lock.unlock();
            }
        }

    }
}
