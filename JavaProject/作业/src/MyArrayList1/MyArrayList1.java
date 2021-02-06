package MyArrayList1;

public class MyArrayList1<T> implements List<T>{
    T[] element;
    int size;
    private static final int INITSIZE=10;

    public MyArrayList1() {
        this.element = (T[])new Object[INITSIZE];
        this.size = 0;
    }

    @Override
    public int size() {//O(1)
        return size;
    }

    @Override
    public boolean isEmpty() {//O(1)
        if (size==0) return true;
        else return false;
    }

    @Override
    public void addHead(T value) {//O(n)
        if (size == INITSIZE) {
            System.out.println("顺序表已满，无法插入！");
        }
        for(int i=size-1;i>=0;i--){
            element[i+1] = element[i];
        }
        element[0] = value;
        size++;
    }

    @Override
    public void addTail(T value) {//O(1)
        element[size++] = value;
    }

    @Override
    public void deleteHead(){//O(n)
        if (isEmpty()) {
            System.out.println("顺序表为空，无法删除");
        }
        for (int i=0;i<size;i++){
            element[i]=element[i+1];
        }
        size--;
    }

    @Override
    public void deleteTail() {//O(1)
        if (isEmpty()) {
            System.out.println("顺序表为空，无法删除");
        }
        size--;
    }

    @Override
    public void delete(int index) {//O(n)
        if (isEmpty()) {
            System.out.println("顺序表为空，无法删除");
        }
        if (index < 0 || index > size) {
            System.out.println("输入错误");
        }
        for (int i=index;i<size-1;i++){
            element[i]=element[i+1];
        }
        size--;
    }

    @Override
    public T get(int index) {//O(1)
        if (index < 0 || index > size) {
            System.out.println("输入错误");
        }
        return element[index];
    }
}
