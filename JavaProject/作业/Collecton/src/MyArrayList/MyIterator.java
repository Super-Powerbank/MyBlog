package MyArrayList;

import java.util.Iterator;

class MyIterator<E> implements Iterable{
    private E[] elements;//存放元素的容器
    private int size; //存放元素的个数

    public MyIterator(E[] elements){
        this.elements = elements;
        this.size = elements.length;
    }
    @Override
    public Iterator iterator(){
        return new Iterator(){

            private int cursor = -1;
            @Override
            public boolean hasNext() {
                return cursor+1 < size;
            }
            @Override
            public Object next() {
                return elements[++cursor];
            }
        };
    }
}
