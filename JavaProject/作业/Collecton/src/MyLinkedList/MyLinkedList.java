package MyLinkedList;

public class MyLinkedList<E> {
    private int size; //链表的元素个数
    private Node<E> first; //指向链表的第一个元素
    private Node<E> last; //指向链表的最后一个元素

    class Node<E>{
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add(E value){
        //尾插法
        //考虑链表为空和链表不为空两种情况
        Node<E> newNode = new Node<>(value, last, null);
        if(last == null){
            first = newNode;
        }else{
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void add(int index, E value){
        //确定index执行的节点
        if(index < 0 || index > size){
            return;
        }
        if(index == size){
            //尾插法
            add(value);
        }else{
            Node<E> succ = findNodeByIndex(index);
            Node<E> succPrev = succ.prev;
            Node<E> newNode = new Node(value, succPrev, succ);
            succ.prev = newNode;
            if(succPrev == null){
                //原先链表只有一个节点
                first = newNode;
            }else{
                succPrev.next = newNode;
            }
        }
    }

    public Node<E> findNodeByIndex(int index){
        Node<E> tmp = first;
        for(int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp;
    }

    public boolean remove(E value){
        //删除元素所在的节点
        Node<E> succ = findNodeByValue(value);
        if(succ == null){
            return false;
        }
        Node<E> succPrev = succ.prev;
        Node<E> succNext = succ.next;

        if(succPrev == null){
            //所要删除的是第一个节点
            first = succNext;
        }else{
            succPrev.next = succNext;
            succ.prev = null;
        }

        if(succNext == null){
            //所要删除的是最后一个节点
            last = succPrev;
        }else{
            succNext.prev = succPrev;
            succ.next = null;
        }
        succ.data = null;//方便垃圾回收
        size--;
        return true;
    }

    public Node<E> findNodeByValue(E value){
        //返回value所对应的第一个节点
        for(Node<E> tmp=first; tmp != null; tmp=tmp.next){
            if(value.equals(tmp.data)){
                return tmp;
            }
        }
        return null;
    }

    public E set(int index, E newValue){
        if(index < 0 || index >= size){
            return null;
        }
        Node<E> succ = findNodeByIndex(index);
        E oldValue = succ.data;
        succ.data = newValue;
        return oldValue;
    }

    public E get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        return findNodeByIndex(index).data;
    }

    @Override
    public String toString(){
        StringBuilder strs = new StringBuilder();
        for(Node<E> tmp=first; tmp!=null; tmp=tmp.next){
            strs.append(tmp.data+" ");
        }
        return strs.toString();
    }
}
