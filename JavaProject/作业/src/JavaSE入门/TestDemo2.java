package JavaSE入门;

import java.util.Arrays;

public class TestDemo2 {
    public static int[] sort(int[] arr) {
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[i / 2] = arr[i];
            }
            else {
                brr[i/2+5]=arr[i];
//                for(int j=5;j<arr.length;j++){
//                    if(brr[j]==0){
//                        brr[j] = arr[i];
//                    }
//                    else{
//                        continue;
//                    }
//                    break;
//                }
            }
        }
        return brr;
    }




    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int[]brr=sort(arr);
        System.out.println(Arrays.toString(brr));
    }

}
