package MyArrayList;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class MyArrayList<E> {
    private E[] elements;//存放元素的容器
    private int size; //实际的元素个数
    private final static int defaultCapacity = 5; //默认的初始化参数

    public MyArrayList() {
        this(defaultCapacity);
    }

    public MyArrayList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void add(E value) {
        //判断是否需要扩容
        if (size == elements.length) {
            //扩容
            this.elements = Arrays.copyOf(this.elements, 2 * elements.length);
        }
        //插入元素到数组尾
        elements[size++] = value;
    }

    public boolean remove(E value) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (value.equals(this.elements[i])) {
                //i位置是所要删除的元素
                System.arraycopy(this.elements, i + 1, this.elements, i, size - 1 - i);
                this.elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    public boolean set(int index, E value) {
        try {
            checkIndex(index);
            elements[index] = value;
            return true;
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= elements.length) {
            throw new UnsupportedOperationException("the index is illegal");
        }
    }

    public E get(int index) {
        try {
            checkIndex(index);
            return elements[index];
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean contains(E value) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {
        StringBuilder strs = new StringBuilder();
        for (int i = 0; i < size; i++) {
            strs.append(elements[i] + " ");
        }
        return strs.toString();
    }

    public void writeObject() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            for (int i = 0; i < size; i++) {
                oos.writeObject(elements[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readObject() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("a.txt"));
            Object[] a = elements;

            for (int i = 0; i < size; i++) {
                a[i] = ois.readObject();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
