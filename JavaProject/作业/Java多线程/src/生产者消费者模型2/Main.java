package 生产者消费者模型2;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> C = new LinkedList<>();
        ReentrantLock lock = new ReentrantLock(true);
        Condition proCondition = lock.newCondition();
        Condition cumCondition = lock.newCondition();
        for (int i = 0; i < 3; i++) {
            ProducerDemo producer = new ProducerDemo(C, lock, proCondition, cumCondition);
            ConsumerDemo consumer = new ConsumerDemo(C, lock, proCondition, cumCondition);
            producer.start();
            consumer.start();
        }
    }
}
