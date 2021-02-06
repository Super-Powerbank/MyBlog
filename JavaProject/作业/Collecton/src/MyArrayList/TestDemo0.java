package MyArrayList;

import MyArrayList1.MyArrayList1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestDemo0 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list.toString());

    }
}

