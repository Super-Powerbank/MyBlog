package HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

class MyHashMap<K,V>{
    private Node<K, V>[] table;
    private int size;

    class Node<K,V>{
        protected K key;
        protected V value;
        protected int hash;
        protected Node<K, V> next;

        public Node(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }
    }

    public MyHashMap(int capacity){
        table = new Node[capacity];
    }

    public Iterator<Node<K, V>> iterator(){
        return new Itr();
    }

    class Itr implements Iterator<Node<K, V>>{
        private int currentIndex;//当前桶的位置
        private Node<K, V> nextNode;//返回的下一个数据节点
        private Node<K, V> currentNode; //上一次next返回的数据节点

        public Itr(){
            if(MyHashMap.this.isEmpty()){
                return;
            }
            for(int i=0; i < table.length; i++){
                currentIndex = i;
                Node<K, V> firstNode = table[i];
                if(firstNode != null){
                    nextNode = firstNode;
                    return;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public Node<K, V> next() {
            //返回下一个数据节点
            currentNode = nextNode;
            //nextNode指向自己的next
            nextNode = nextNode.next;
            if(nextNode == null){
                //说明当前桶的链表已经遍历完毕
                //寻找下一个非空的桶
                for(int i=currentIndex+1; i<MyHashMap.this.table.length; i++){
                    //设置当前桶位置
                    currentIndex = i;
                    Node<K,V> firstNode = MyHashMap.this.table[currentIndex];
                    if(firstNode != null){
                        nextNode = firstNode;
                        break;
                    }
                }
                //nextNode保存的就是下一个非空的数据节点
            }
            return currentNode;
        }

        @Override
        public void remove() {
            if(currentNode == null){
                return;
            }
            K currentKey = currentNode.key;
            MyHashMap.this.remove(currentKey);
            currentNode = null;
        }
    }

    public void resize(){
        //扩容桶table
        Node<K, V>[] newTable = new Node[table.length * 2];
        for(int i=0; i<table.length; i++){
            //将oldTable中每一个位置映射到newTable中
            rehash(i, newTable);
        }
        this.table = newTable;
    }

    public void rehash(int index, Node<K,V>[] newTable){
        Node<K, V> currentNode = table[index];
        if(currentNode == null){
            return;
        }

        Node<K, V> lowListHead = null; //低位的头
        Node<K, V> lowListTail = null; //低位的尾
        Node<K, V> highListHead = null; //高位的头
        Node<K, V> highListTail = null; //高位的尾

        //currentNode表示oleTable下index位置中当前节点
        while(currentNode != null){
            //当前节点在newTable中的位置
            int newIndex = newTable.length-1 & hash(currentNode.key);

            if(newIndex == index){
                //映射到原先下标处
                if(lowListHead == null){
                    lowListHead = currentNode;
                    lowListTail = currentNode;
                }else{
                    lowListTail.next = currentNode;
                    lowListTail = lowListTail.next;
                }
            }else{
                //newIndex与index不等，映射到高位下标处
                if(highListHead == null){
                    highListHead = currentNode;
                    highListTail = currentNode;
                }else{
                    highListTail.next = currentNode;
                    highListTail = lowListTail.next;
                }
            }
            currentNode = currentNode.next;
        }
        //将lowList head->tail之前的节点链接到index位置
        if(lowListTail != null){
            newTable[index] = lowListHead;
            lowListHead.next = null;
        }

        //将highList head->tail之前的节点链接到index+table.length位置
        if(highListTail != null){
            newTable[index+this.table.length] = highListHead;
            highListHead.next = null;
        }
    }

    public int hash(Object key) {
        int h;
        return (h = key.hashCode()) ^ (h >>> 16);
    }

    public void put(K key, V value){
        //确定所要添加元素的位置
        int hash = hash(key);//散列码
        int index = table.length-1 & hash;//确定的位置

        //newNode -》table[index] == null || key在map不存在
        //table[index]已经存在数据
        //table[index]不存在数据
        Node<K, V> firstNode = table[index];//得到该位置的第一个节点
        if(firstNode == null){
            table[index] = new Node(key, value, hash);
            size++;
        }else{
            //第一种情况 key已经存在 考虑新值覆盖旧值
            //第二种情况 key不存在   封装一个新的node尾插法插入链表
            if(firstNode.key.equals(key)){
                firstNode.value = value; //新值替换旧值
            }else{
                Node<K,V> tmp = firstNode;
                while(tmp.next != null && !tmp.key.equals(key)){
                    tmp = tmp.next;
                }
                if(tmp.next == null){
                    if(tmp.key.equals(key)){
                        tmp.value = value; //新值替换旧值
                    }else{
                        tmp.next = new Node(key, value, hash);
                        size++;
                    }
                }else{
                    tmp.value = value;
                }
            }
        }
    }

    public boolean remove(K key){
        int hash = hash(key);
        int index = table.length-1 & hash;

        Node<K, V> firstNode = table[index];

        if(firstNode == null){
            return false;
        }else{
            if(firstNode.next == null){
                if(firstNode.key.equals(key) && firstNode.hash == hash){
                    //为什么判断key是否相等的同时还需要判断散列码
                    table[index] = null;
                    return true;
                }
            }
            Node<K,V> tmpPrev = firstNode;
            Node<K, V> tmp = firstNode.next;
            while(tmp.next != null){
                if(tmp.key.equals(key) && tmp.hash == hash){
                    //tmp之前节点的next指向tmp.next
                    tmpPrev.next = tmp.next;
                    size--;
                }else{
                    tmpPrev = tmp;
                    tmp = tmp.next;
                }
            }
        }
        return false;
    }

    public Node<K,V> get(K key){
        //获取对应key所在数组的index
        int hash = hash(key);//散列码
        int index = table.length - 1 & hash; //定位key记录所在的位置

        Node<K, V> firstNode = table[index];
        if (firstNode == null) {
            return null;
        }
        if (hash == firstNode.hash && key == firstNode.key) {
            return firstNode;
        } else {
            //遍历链表
            Node<K, V> currentNode = firstNode.next;
            while (currentNode != null) {
                if (currentNode.hash == hash && currentNode.key == key) {
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class TestDemo {
    public static void main(String[] args) {
    }
}

