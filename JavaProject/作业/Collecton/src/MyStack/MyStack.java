package MyStack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    private int[] element;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        this.element = new int[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        if(size == element.length){
            element = Arrays.copyOf(element,element.length+(element.length>>1));
        }
    }
    public void push(int value){
        ensureCapacity();
        element[size++] = value;
    }
    public void pop(){
        if(size == 0)
            return;
        size--;//size:
    }
    public int peek(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return element[size-1];
    }
    public void empty(){
        if (size==0){
            System.out.println("栈为空");
        }
    }
}