package 生产者消费者模型;

public class Consumer implements Runnable {
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            warehouse.consumer();
        }
    }
}
