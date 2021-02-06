package JavaSE入门;

import java.util.Arrays;

public class TestDemo3 {
//    public static void change(int[] arr){
//        int i = 0;
//        int j = arr.length-1;
//        while (i <j){
//            //从前向后查找，直到找到偶数停止
//            while (arr[i] % 2 != 0&&i<j){
//                i++;
//            }
//            //i 标记偶数为止
//            //从后向前查找，直到找到奇数停止
//            while (arr[j] % 2 == 0&&i<j){
//                j--;
//            }
//            // j 标记的是奇数位置
//            swap(arr,i,j);
////                int temp = arr[i];
////                arr[i] = arr[j];
////                arr[j] = temp;
//        }
//    }
    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void bubbleSort(int[] arr){
        boolean flag = false;
        for(int j=0;j<arr.length;j++){//j控制趟数
            flag = false;
            // 第一趟过程
            for(int i=0;i<arr.length-1-j;i++){//每一趟
                if(arr[i] > arr[i+1]){
                    flag = true;
                    swap(arr,i,i+1);
                }
            }
            if(flag){
                continue;
            }else{
//                return;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,2,1,10,8,13,17,21,11,22,24,99,98,66};
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        bubbleSort(arr);
//        change(arr);
        System.out.println(Arrays.toString(arr));
        // arr: 奇数  偶数
    }

}
