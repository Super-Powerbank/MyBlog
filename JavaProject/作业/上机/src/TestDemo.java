import jdk.nashorn.internal.runtime.FindProperty;

import java.util.Stack;

public class TestDemo {
    //1、在一个长度为n的数组并且数组中所有数字都在0～n-1的范围内，
    // 找出数组中任意一个重复的数字，要求时间复杂度为O(n)，空间复杂度为O(1)
// public static void main(String[] args) {
//
//         int[] nums = new int[]{2, 3, 1, 0, 2, 5};
//         int n = nums.length;
//         int[] dup = new int[1];
//         boolean flag = duplicate(nums, n, dup);
//         System.out.println(dup[0]);
//     }
//
//    public  static void swap(int nums[], int m, int n) {
//
//        int temp = nums[m];
//        nums[m] = nums[n];
//        nums[n] = temp;
//    }
//
//    public static boolean duplicate(int nums[], int length, int[] duplication) {
//
//        if (nums == null || length <= 0) {
//            return false;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            while (nums[i] != i) {
//                if (nums[i] == nums[nums[i]]) {
//                    duplication[0] = nums[i];
//                    return true;
//                }
//                swap(nums, nums[i], i);
//            }
//        }
//        return false;
//    }
//}
//2、在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序，请完成一个函数，输入这样一个二维数组和一个整数，判断数组中是否含有该整数。

    public static boolean Find(int value, int[][] array) {
        int row = 0;
        int col = array[0].length - 1;
        while (row <= array.length - 1 && col >= 0) {
            if (value > array[row][col])
                row++;
            else if (value < array[row][col])
                col--;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int value = 2;
        int [][]array ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Find(value,array));
    }

}