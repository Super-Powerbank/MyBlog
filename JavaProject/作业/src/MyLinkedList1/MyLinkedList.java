package MyLinkedList1;

/**
 * 存储数据效率：
 * 头部增加：O(1)
 * 尾部增加：O(1)
 * 查询元素：O(n)
 * 删除指定元素：O(n)
 * 头部删除：O(1)
 * 尾部删除：O(n)
 * @param <T>
 */

public class MyLinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void addHead(T value) {
        Node<T> newNode = new Node<>(value);
        //当前链表为空
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    @Override
    public void addTail(T value) {
        Node<T> newNode = new Node<>(value);
        //当前链表为空
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public boolean contains(T value) {
        for(Node<T> p = head;p!=null;p=p.getNext()){
            if(p.getValue().compareTo(value)==0){
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeValue(T value) {
        //当前链表=null
        if(head == null){
            return;
        }
        Node <T> p = head;
        Node <T> q = head.getNext();
        while( p.getNext() != null){
            if(p.getNext().getValue()==value){
                //要删除的节点
                p.setNext(p.getNext().getNext());
                q = q.getNext();
            }else{
                //q 对应的节点不用删
                p = q;
                q = q.getNext();
            }
        }
        if (head.getValue() == value){
            removeHead();
        }

    }



//        if (head.getValue().compareTo(value) == 0){
//            removeHead();
//            return;
//        }
        //找待删结点的前驱结点
//        Node<T> p=head;
//        for(;p.getNext()!=null;p=p.getNext()){
//            if (p.getNext().getValue().compareTo(value) == 0) {
//                    p.getNext().setValue(null);
//                    p.getNext().setNext(null);
//                    //把待删结点的前驱结点跟待删结点的后驱结点相连接
//                    p.setNext(p.getNext().getNext());
////                    break;
//                }
//        }
//        //若待删结点是尾部，则新尾部为待删结点的前驱
//        if (tail == null){
//            tail = p;
//        }
//    }

    @Override
    public void removeHead() {
        //当前链表为空
        if(head == null){
            return;
        }
        Node<T> p = head.getNext();
        head = null;
        head = p;
        if (head == null){
            tail = null;
        }
    }

    @Override
    public void removeTail() {
        //当前链表为空
        if(head == null){
            return;
        }
        //只有一个结点
        if(head.getNext() == null){
            head = null;
            tail = null;
            return;
        } else {
            //找尾巴的前驱
            Node<T> p = head;
            for (; p.getNext().getNext() != null; p = p.getNext()) {
                ;
            }
            tail = p;//将尾巴的前驱定义为新尾巴
            p.getNext().setValue(null);
            p.getNext().setNext(null);
            tail.setNext(null);
        }
    }

    @Override
    public void changeValue(T src, T aim) {
        for(Node<T> p = head;p!=null;p=p.getNext()){
            if(p.getValue().compareTo(src) == 0){
                p.setValue(aim);
            }
        }
    }

    public void input(){
        for (Node<T> p = head;p!=null;p = p.getNext()){
            System.out.print(p.getValue()+" ");
        }
    }


}
