package MyArrayList1;

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList1<Integer> my= new MyArrayList1<Integer>();
        my.addHead(1);
        my.addHead(2);
        my.addTail(4);
        my.deleteHead();
        my.deleteTail();
        my.isEmpty();
        for (int i = 0; i <my.size; i++) {
            System.out.println("第" + (i+1) + "个数为" + my.get(i));
        }
    }
}
