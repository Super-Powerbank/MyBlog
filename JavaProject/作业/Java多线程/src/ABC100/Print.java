package ABC100;

class Print{

    private int flag = 1;
    private int count = 1;

    public int getCount() {
        return count;
    }

    public synchronized void printA(){
        while (flag != 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int a =count+1;
        int b = count+2;
        int c= count+3;
        int d= count+4;
        System.out.println("线程"+Thread.currentThread().getName()+":"+count+" "+a+" "+b+" "+c+" "+d);
        flag = 2;
        count =d+1;
        notifyAll();
    }
    public synchronized void printB(){
        while (flag != 2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int a =count+1;
        int b = count+2;
        int c= count+3;
        int d= count+4;
        System.out.println("线程"+Thread.currentThread().getName()+":"+count+" "+a+" "+b+" "+c+" "+d);
        flag = 3;
        count=d+1;
        notifyAll();
    }
    public synchronized void printC(){
        while (flag != 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int a =count+1;
        int b = count+2;
        int c= count+3;
        int d= count+4;

        System.out.println("线程"+Thread.currentThread().getName()+":"+count+" "+a+" "+b+" "+c+" "+d);
        flag = 1;
        count=d+1;
        notifyAll();
    }
}

class MyThread implements Runnable{
    private Print print;
    public MyThread(Print print) {
        this.print = print;
    }
    @Override
    public void run() {
        while (print.getCount() < 90){
            if(Thread.currentThread().getName().equals("A")){
                print.printA();
            }else if(Thread.currentThread().getName().equals("B")){
                print.printB();
            }else if(Thread.currentThread().getName().equals("C")){
                print.printC();
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Print print = new Print();
        MyThread myThread = new MyThread(print);
        Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}