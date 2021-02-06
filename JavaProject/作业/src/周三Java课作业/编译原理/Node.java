package 周三Java课作业.编译原理;


public class Node {
    private int id;
    private static int ID=0;

    public Node(){
        this.id=ID++;
    }

    public int getId() {
        return id;
    }

    public static void reset(){
        ID=0;
    }

    @Override
    public String toString() {
        return id+"";
    }

}
