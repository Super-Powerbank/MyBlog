package Test;


public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        System.out.println(name);

    }


}
