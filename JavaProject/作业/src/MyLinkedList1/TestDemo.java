package MyLinkedList1;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addHead(5);
        myLinkedList.addHead(4);
        myLinkedList.addTail(6);
        myLinkedList.removeHead();
        myLinkedList.removeTail();
        myLinkedList.removeHead();
        myLinkedList.addTail(1);
        myLinkedList.addHead(0);
        myLinkedList.addTail(0);
        myLinkedList.addTail(2);
        myLinkedList.addTail(0);
        myLinkedList.removeValue(0);
        myLinkedList.input();

    }
}
