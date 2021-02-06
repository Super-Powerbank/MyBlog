package 锁;



class MySynchronized implements Runnable{
    private static int index = 1;

    @Override
    public void run() {
        Count();
    }

    public synchronized void Count(){
        for (int i=0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+"："+index++);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MySynchronized mySynchronized = new MySynchronized();
        Thread t1 = new Thread(mySynchronized);
        Thread t2 = new Thread(mySynchronized, "线程2");
        Thread t3 = new Thread(mySynchronized, "线程3");
        Thread t4 = new Thread(mySynchronized, "线程4");
        Thread t5 = new Thread(mySynchronized, "线程5");
        Thread t6 = new Thread(mySynchronized, "线程6");
        Thread t7 = new Thread(mySynchronized, "线程7");
        Thread t8 = new Thread(mySynchronized, "线程8");
        Thread t9 = new Thread(mySynchronized, "线程9");
        Thread t10 = new Thread(mySynchronized, "线程10");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
