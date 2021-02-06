package JavaSE入门;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo6 {
//    public static void bubbleSort(int [] array){
//        if (array==null||array.length==0){
//            return;
//        }
//        for (int i=0;i<array.length-1;i++){
//            for (int j=0;j<array.length-1-i;j++){
//                if (array[j]>array[j+1]){
//                    int tmp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=tmp;
//                }
//            }
//        }
//    }
//    public static int repeatNum(int [] array){
//        if (array==null||array.length==0){
//            return 0;
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]<0||array[i]>array.length-1){
//                return i;
//            }
//        }
//        bubbleSort(array);
//        for (int i=0;i<array.length-1;i++){
//            if (array[i]==array[i+1]){
//                return array[i];
//            }
//        }
//        return 0;
//    }

//    public static int repeatNum(int [] array){
//        for (int i=0;i<array.length;i++){
//            if (array[i]!=i){
//                array[i]=i;
//            }else {
//                return array[i];
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        int[] array={2,3,1,0,2,5};
////        bubbleSort(array);
////        System.out.println(Arrays.toString(array));
//        System.out.println(repeatNum(array));
//        System.out.println(Arrays.toString(array));
//
//    }
//}

// public static void main(String[] args) {
//
//         int[] nums = new int[]{2, 3, 1, 0, 2, 5};
//         int n = nums.length;
//         int[] dup = new int[1];
//         boolean flag = duplicate(nums, n, dup);
//         System.out.println(flag + "," + dup[0]);
//     }
//
//    public static void swap(int nums[], int m, int n) {
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


//计算二进制中1的个数
//  public static int countBits(int num) {
//      int count = 0;
//      while (num != 0) {
//         if (num % 2 != 0) {
//            count++;
//         }
//         num /= 2;
//      }
//     return count;
//  }
//  public static int countBits2(int num){
//      int count=0;
//      while (num!=0){
//          count++;
//          num&=(num-1);
//      }
//      return count;
//  }
//
//    public static void main(String[] args) {
//        System.out.println(countBits(10));
//        System.out.println(countBits2(10));
//    }
//}
//////////////////////////////////////////
//  public static int getSum(int n){
//    int result=0;
//    for (int i=0;i<n;i++){
//      result=result+1;
//    }
//    return result;
//  }
//
//  public static void main(String[] args) {
//
//    System.out.println(getSum(10));
//  }
  //1~n中出现n的次数
//  public static int NumberOf1(int num){
//    int number=0;
//    while (num>0){
//      if (num%10==1){
//        number++;
//      }
//      num/=10;
//    }
//    return number;
//  }
//  public static int NumberOf1BetweenN(int num){
//
//  }
//
//  public static void main(String[] args) {
//
//  }


/**
 *统计一个数字在排序数组中出现的次数
 * 排序数组{1，2，3，3，3，3，5，7，8} 和 数字3
 * 方法一：顺序遍历数组，统计出数字3出现的次数，不过这时没有用到排序数组这一特性
 * 方法二：利用二分查找的思想，先找到数组中3出现的第一个位置first3，然后再找到数组中3出现的最后一个位置end3，出现的次数end3-first3+1
 *
 */
  public static  int getFirstTarget(int [] arr,int k){
    int low=0;
    int high=arr.length-1;
    int mid=0;

    while (low<=high){
      mid=(low + high )/ 2;
      if (arr[mid]==k){
        if (arr[mid-1]!=k){
          return mid;
        }else {
          high=mid-1;
        }
      }else if (arr[mid]>k){
        high=mid-1;
      }else {
        low=mid+1;
      }
    }
    return -1;

  }
  public static int getLastTarget(int [] arr,int k){
    int low=0;
    int high=arr.length-1;
    int mid=0;

    while (low<=high){
      mid=(low+high)/ 2;
      if (arr[mid]==k){
        if (mid==arr.length-1||arr[mid+1]!=k){
          return mid;
        }else {
          low=mid+1;
        }
      }else if (arr[mid]>k){
        high=mid-1;
      }else {
        low=mid+1;
      }
    }
    return -1;
  }
  public static int findApperCountInArray(int[]arr,int k){
    //判断函数合法性
    if (arr==null||arr.length==0){
      return -1;
    }
    int first=getFirstTarget(arr,k);
    int last=getLastTarget(arr,k);
    if (first>-1&&last>-1){
      return last-first+1;

    }return -1;
  }
  public static void main(String[] args) {
    int []arr={1,2,3,3,3,3,5,7,8,9,9,9,9};
    System.out.println(findApperCountInArray(arr,9));
  }















}