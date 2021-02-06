package MyArrayDeque;



public class TestDemo {
    public static void main(String[] args) {
        MyArrayDeque<Integer> queue = new MyArrayDeque<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(8);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.toString());

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        System.out.println(queue.get());
//
//        System.out.println(queue.toString());

//        Deque<String> queue = new ArrayDeque<>();
//        //添加元素
//        queue.addFirst("first1");
//        queue.addLast("last1");
//        queue.offerFirst("offerfirst1");
//        queue.offerLast("offerlast1");
//        queue.addFirst("a");
//        queue.addFirst("b");
//        queue.addFirst("c");
//
//        //删除元素
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeLast());
//        System.out.println(queue.pollFirst());
//        System.out.println(queue.pollLast());
//
//        //获取元素
//        System.out.println(queue.getFirst());
//        System.out.println(queue.getLast());
//        System.out.println(queue.peekFirst());
//        System.out.println(queue.pollLast());

    }
}