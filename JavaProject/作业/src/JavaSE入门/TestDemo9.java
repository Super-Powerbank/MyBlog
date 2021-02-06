package JavaSE入门;

public class TestDemo9 {
    public static int  getMaxArray(int[] arr) {
        int Sum = 0;
        int MaxSum = 0;

        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
            if (Sum < 0) {
                Sum = 0;
            }
            if (Sum > MaxSum) {
                MaxSum = Sum;
            }
        }
        if (MaxSum == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    MaxSum = arr[i];
                }
                if (arr[i] > MaxSum) {
                    MaxSum = arr[i];
                }
            }
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,4,2,-1,-2,7,6,1,-4};
        System.out.println(getMaxArray(arr));
    }
}
