package Test;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "主线程运行开始!");
        MyThread Thread1 = new MyThread("A");
        MyThread Thread2 = new MyThread("B");
        MyThread Thread3 = new MyThread("C");


        Thread1.start();
        Thread2.start();
        Thread3.start();


        try {
            Thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
    }
}
