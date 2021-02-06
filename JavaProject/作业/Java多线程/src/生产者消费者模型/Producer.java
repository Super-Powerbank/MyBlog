package 生产者消费者模型;

public class Producer implements Runnable {
    private Warehouse warehouse;

    public Producer(Warehouse cherk) {
        this.warehouse = cherk;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            warehouse.product();
        }
    }
}
