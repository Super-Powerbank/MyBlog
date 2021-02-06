package MyArrayList1;

public interface List <T> {
    //获得线性表长度
    public int size();

    //判断线性表是否为空
    public boolean isEmpty();

    //头部插入元素
    public void addHead(T value);

    //尾部插入元素
    public void addTail(T value);

    //头部删除元素
    public void deleteHead();

    //尾部删除元素
    public void deleteTail();

    //删除指定元素
    public void delete(int index);

    //获取指定位置的元素
    public T get(int index);

}
