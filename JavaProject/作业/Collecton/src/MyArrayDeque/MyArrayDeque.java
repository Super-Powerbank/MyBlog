package MyArrayDeque;

import java.util.Arrays;

public class MyArrayDeque<E> {
    private E[] elements;
    private int head; //永远指向循环数组的头
    private int tail;//永远指向循环数组的尾
    private static int maxSize = 5;

    public MyArrayDeque() {
        this(5);
    }

    public MyArrayDeque(int capacity) {
        elements = (E[]) new Object[capacity];
        maxSize = capacity;
    }

    public void add(E value) {
        //默认队尾添加
        //判满
        if ((tail + 1) % maxSize == head) {
            //扩容
            elements = Arrays.copyOf(elements, 2 * elements.length);
            maxSize = elements.length;
        }
        elements[tail] = value;
        tail = (tail + 1) % maxSize;

    }

    public E remove() {
        //默认队头删除
        if (head == tail) {
            throw new UnsupportedOperationException("空");
        }
        System.out.println(head);
        E result = elements[head];
        elements[head] = null; //方便垃圾回收
        head = (head + 1) % maxSize;
        return result;
    }

    public E get() {
        return elements[head];
    }

    public String toString() {
        StringBuilder strs = new StringBuilder();
        for (int i = head; i != tail; i = (i + 1) % maxSize) {
            strs.append(elements[i] + " ");
        }
        return strs.toString();
    }
}

