package MyLinkedList1;

public interface List<T> {
    void addHead(T value);
    void addTail(T value);
    boolean contains(T value);//是否包含数据
    void removeValue(T value);
    void removeHead();
    void removeTail();
    void changeValue(T src,T aim);//将src数据修改成aim
}