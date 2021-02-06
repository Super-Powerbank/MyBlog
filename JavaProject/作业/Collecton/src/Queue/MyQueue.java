package Queue;

import java.util.Arrays;

public class MyQueue {
    private int[] elements;
    private int size;
    private int head; //永远指向循环数组的头
    private int tail;//永远指向循环数组的尾
    private static  int maxSize = 10;

    public MyQueue() {
        this.elements = new int[maxSize];
    }
    private void ensureCapacity(){
        if(size == elements.length){
            elements = Arrays.copyOf(elements,elements.length+(elements.length>>1));
        }
    }
    public void push(int value){
        ensureCapacity();
        elements[size++] = value;
    }
    public void pop(){
        if(size == 0)
            return;
        size--;//size:
    }
    public void add(int value) {
        //默认队尾添加
        //判满
        if ((tail + 1) % maxSize == head) {
            ensureCapacity();
        }
        elements[tail] = value;
        tail = (tail + 1) % maxSize;

    }

    public void remove() {
        //默认队头删除
        if (head == tail) {
            throw new UnsupportedOperationException("空");
        }
        System.out.println(head);
        int result = elements[head];
        head = (head + 1) % maxSize;
        return;
    }

    public int  getsize() {
        return size;
    }




}
