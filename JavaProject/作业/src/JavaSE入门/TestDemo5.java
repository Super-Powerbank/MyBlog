package JavaSE入门;

import java.util.Scanner;

public class TestDemo5 {
//    public static void login(int[]arr){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int flag=0;
//        for (int i=0;i<arr.length;i++){
//            if (n==arr[i]){
//                System.out.println("登陆成功");
//                flag=1;
//            }
//        }
//            if (flag==0){
//                System.out.println("登陆失败，请注册");
//            }
//    }
//
//    public static void register(int[]arr){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int flag=0;
//        for (int i=0;i<arr.length;i++){
//            if (n==arr[i]){
//                System.out.println("已注册，请登录");
//                flag=1;
//            }
//        }
//        if(flag==0){
//                for (int j=0;j<arr.length;j++){
//                    if(arr[j]==0){
//                        arr[j]=n;
//                        System.out.println("注册成功");
//                        return;
//                    }
//                }
//        }
//    }
//
//    public static void operate(int[]arr){
//        System.out.println("1.登录 2.注册 3.退出");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n==1){
//            login(arr);
//        }else if (n==2){
//            register(arr);
//        }else if (n==3){
//            return;
//        }else {
//            System.out.println("输入错误");
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr=new int [10];
//        arr[0]=1;arr[1]=2;arr[2]=3;
//        operate(arr);
//    }
//}


//二分查找总结

//   public static int search(int[]arr,int value) {
//       int left = 0;
//       int right =arr.length;
//       int mid=0;
//       while (left <= right) {
//            mid = ((right - left) >>> 1) + left;
//           if (arr[mid] == value) {
//               return mid;
//           } else if (arr[mid] > value) {
//               right = mid - 1;
//           } else {
//               left = mid + 1;
//           }
//       }
//       return -1;
//   }
//   public static void main(String[] args){
//       int[] arr = {1,2,3,4,5,6,7,8,9,10};
//       int result=search(arr,6);
//       if (result==-1){
//           System.out.println("不好意思没找到");
//       }else {
//           System.out.println("找到了下标在"+result);
//       }
//
//   }
//}


    //n个1相加
//    public static int getSum(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return getSum(n - 1) + 1;
//    }
//
//    public static void main(String[] args) {
//        int result=getSum(5);
//        System.out.println(result);
//    }
    //求阶乘
//    public static int fac(int n){
//        //退出条件   递归深度
//        if(n == 1){
//            return 1;
//        }
//        return fac(n-1)*n;
//    }
//
//    public static void main(String[] args) {
//        int result=fac(5);
//        System.out.println(result);
//    }

    //斐波那契数列
//    public static int fabnic(int n){
//         if(n == 1 || n == 2){
//             return 1;
//         }
//         return fabnic(n-1)+fabnic(n-2);
//    }
//
//    public static void main(String[] args) {
//        int result=fabnic(5);
//        System.out.println(result);
//    }

    //二分查找递归
    public static int binarySearch0(int[] arr,int value,int begin,int end){
        if(begin > end){
            return -1;
        }

        int midIndex = ((end-begin)>>>1)+begin;
        if(arr[midIndex] == value){
            return midIndex;
        }else if(arr[midIndex] > value){
            return binarySearch0(arr,value,begin,midIndex-1);
        }else{
            return binarySearch0(arr,value,midIndex+1,end);
        }
    }
    public static int binarySearch(int[] arr,int value){
        //自己构建问题规模（查找的区间范围）
        return binarySearch0(arr,value,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result=binarySearch(arr,6);
        System.out.println("下标位置在"+result);

    }
}
