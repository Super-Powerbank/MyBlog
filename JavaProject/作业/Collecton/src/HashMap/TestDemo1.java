package HashMap;

import java.util.HashSet;

public class TestDemo1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
//        int size =0;
        while (hashSet.size()<10){
            hashSet.add((int)(Math.random()*20+5));
        }
        for (Integer i:hashSet){
            System.out.println(i);
        }

    }
}
