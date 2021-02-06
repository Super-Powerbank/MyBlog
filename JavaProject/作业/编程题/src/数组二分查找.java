import java.util.Scanner;

public class 数组二分查找 {
    public static int search(int[]arr,int value) {
        int left = 0;
        int right =arr.length;
        int mid=0;
        while (left <= right) {
            mid = ((right - left) >>> 1) + left;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String[] s1=s.split(",");
        int[] intArray=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            intArray[i]=Integer.parseInt(s1[i]);
        }
        int k =sc.nextInt();
        int result=search(intArray,4);
        if (result==-1){
            System.out.println(intArray.length+1);
        }else {
            System.out.println(result+1);
        }

    }
}
