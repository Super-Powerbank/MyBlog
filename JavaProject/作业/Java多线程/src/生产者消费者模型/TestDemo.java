package 生产者消费者模型;

import java.util.concurrent.ConcurrentHashMap;

public class TestDemo {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        new Thread(new Producer(warehouse), "生产者").start();
        new Thread(new Consumer(warehouse), "消费者").start();
    }
}
