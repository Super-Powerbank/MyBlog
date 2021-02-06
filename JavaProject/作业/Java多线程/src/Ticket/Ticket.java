package Ticket;

class Ticket implements Runnable {
    int ticket = 1;

    @Override
    public void run() {
        while (true) {
            show();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void show(){
        if(ticket<101) {
            System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket++);
        }
    }
//    public synchronized void
}


 class TestDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}