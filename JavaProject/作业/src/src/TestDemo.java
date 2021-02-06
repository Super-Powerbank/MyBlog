package src;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.addHead(1);
        myArrayList.addHead(2);
        myArrayList.deleteTail();
        myArrayList.addHead(3);
        myArrayList.addTail(4);
        myArrayList.deleteHead();
        myArrayList.getSum();




    }

}
