import java.util.Arrays;

public class 奇数在前偶数在后 {
    public static void change(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i <j){
            while (arr[i] % 2 != 0&&i<j){
                i++;
            }
            while (arr[j] % 2 == 0&&i<j){
                j--;
            }
            swap(arr,i,j);
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int [] arr={3,5,7,9,2,1,10,8,13,17,21,11,22,24,99,98,66};


        change(arr);
        System.out.println(Arrays.toString(arr));
    }

}
