import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class 寻找第k大 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(treeSet);
        if (k > arrayList.size()) {
            System.out.println(arrayList.get(0));
        } else {
            System.out.println(arrayList.get(arrayList.size() - (k)));
        }
    }
}
