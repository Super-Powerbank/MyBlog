package 生产者消费者模型2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 消费者
 */
public class ConsumerDemo extends Thread {
    private LinkedList<Integer> C;
    private Random random = new Random();
    private ReentrantLock lock;
    private Condition proCondition;
    private Condition cumCondition;

    public ConsumerDemo(LinkedList<Integer> c, ReentrantLock lock, Condition proCondition, Condition cumCondition) {
        C = c;
        this.lock = lock;
        this.proCondition = proCondition;
        this.cumCondition = cumCondition;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            //判断仓库是否为空，空时则阻塞
            try {
                while (C.size() == 0) {
                    System.out.println("仓库已空，消费者线程则塞");
                    try {
                        cumCondition.await(); //消费者线程  阻塞在这里
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //从仓库中获取数据
                Integer count = C.removeFirst();
                System.out.println("消费者线程从仓库消费：" + count);

                //通知生产者线程生产数据
                //C.notifyAll();
                proCondition.signalAll();
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

