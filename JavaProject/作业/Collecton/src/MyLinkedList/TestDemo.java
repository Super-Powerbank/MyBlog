package MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(100);

        list.addLast(2);
        list.removeFirst();

        list.remove(1);

        System.out.println(list.get(1));

        list.set(1, 1000);

        for(Integer i: list){
            System.out.println(i);
        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
