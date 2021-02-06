package Test1;

public class TestDemo {
    //加join的线程
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
        Thread1 mTh1=new Thread1("A");
        Thread1 mTh2=new Thread1("B");
        mTh1.start();
        mTh2.start();
        try {
            mTh1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            mTh2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");

    }


//不加join的线程

//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
//        Thread1 mTh1=new Thread1("A");
//        Thread1 mTh2=new Thread1("B");
//        mTh1.start();
//        mTh2.start();
//        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");
//
//    }

}
