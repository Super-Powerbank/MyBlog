package src;

import java.util.Arrays;

public class MyArrayList {
        private int[] element;
        private int size;//有效个数

        public MyArrayList(){
            this(10);
        }
        public MyArrayList(int num){
            element = new int[num];
        }
        public void getSum(){
            System.out.println(Arrays.toString(element));
        }
        private void ensureCapacity(){
            if(size == element.length){
                int newLength = element.length+(element.length>>1);
                element = Arrays.copyOf(element,newLength);
            }
        }
        public void addHead(int value){
            ensureCapacity();
            for(int i=size-1;i>=0;i--){
                element[i+1] = element[i];
            }
            element[0] = value;
            size++;
        }
        public void addTail(int value){
            ensureCapacity();
            element[size++] = value;
        }
        public void deleteTail(){
            size--;
        }
        public void deleteHead(){
            for (int i=0;i<size;i++){
                element[i]=element[i+1];
            }
        }


}
