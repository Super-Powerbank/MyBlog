package 生产者消费者模型;

/**
 * 工具类，生产与消费的方法
 */
class Warehouse {
    // 商品库存
    private int product = 0;

    // 2个商品为最大库存量，为此生产出一个商品
    public synchronized void product() {
        while (product==2){
            System.out.println("仓库满");
            try {
                // 当库存满的时候，线程调用wait方法，会释放锁
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println(Thread.currentThread().getName()+"生产了一个商品,当前库存为:"+product);
        // 唤醒其他等待的线程
        this.notifyAll();
    }

    // 消费方法，每次消费商品数量减一
    public  synchronized void consumer()  {
        while (product<=0){
            System.out.println("仓库空！");
            try {
                // 当缺货了，就不让消费了，等待生产者生产商品
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println(Thread.currentThread().getName()+"消费了一个商品,当前库存为"+product);
        // 唤醒等待的线程
        this.notifyAll();
    }
}
