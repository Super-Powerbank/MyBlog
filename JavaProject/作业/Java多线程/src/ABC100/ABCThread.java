package ABC100;

public class ABCThread extends Thread {
    private DIYObject object;//线程共享对象，线程间通知也是该对象
    private int threadId;//当前线程编号
    private  static int IndexMax = 1;

    /**
     * 三个线程命名为ABC
     * 传递的线程ID为int类型的数据
     * name数组下标  0 1 2 分别 A B C
     * name[0] = 'A'
     * 线程循环使用(threadId+1)% 3
     * threadId=0当前(0+1)%3=1    即下一个执行threadID=1  name[1] = b
     * threadId=1d (1+1)%3 =2     即threadID = 2        name[2] = c
     * threadId =2  (2+1)%3 = 0   即threadID= 0        name[0]=A
     */
    private String name[] = {"A", "B", "C"};

    public ABCThread(DIYObject o, int id) {
        this.object = o;
        this.threadId = id;
    }

    @Override
    public void run() {
        while (IndexMax < 90) {
            synchronized (object) {
                //先判断通知的是否是当前线程
                while (!(threadId == object.getIndex())) {
                    //循环判断是否当前的线程执行，执行条件：
                    // 当先线程threadID和即将执行的线程DIYObject.getIndex()相同
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //执行
//                System.out.println(name[threadId] + ":");

                for (int i = 0; i < 5; i++) {
                    System.out.println(name[threadId] + ":" + IndexMax++);


                    //执行下一个执行的线程ID
                    object.setIndex((threadId + 1) % 3);

                    //通过之其他的两个线程
                    object.notifyAll();
                }
            }

        }
    }

    public static void main(String[] args) {
        DIYObject diyObject = new DIYObject();
        new ABCThread(diyObject, 0).start();
        new ABCThread(diyObject, 1).start();
        new ABCThread(diyObject, 2).start();
        //启动三个线程

    }
}

