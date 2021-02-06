package Ticket;

class TicketSystemTask implements Runnable{
    private static final int max = 200; //最多叫到50号
    private static int index = 1; //当前叫号值


    @Override
    public void run() {
        while(index <= max){
            System.out.println("当前办理业务为："+Thread.currentThread().getName()+", 当前号码为："+index++);
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        TicketSystemTask task = new TicketSystemTask();
        Thread t1 = new Thread(task, "1号柜台");
        Thread t2 = new Thread(task, "2号柜台");
        Thread t3 = new Thread(task, "3号柜台");
        Thread t4 = new Thread(task, "4号柜台");
        Thread t5 = new Thread(task, "5号柜台");
        t1.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
