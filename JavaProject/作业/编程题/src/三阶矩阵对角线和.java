import java.util.Scanner;

public class 三阶矩阵对角线和 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2 =0;
        int[][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j) sum1 += arr[i][j];
                if (j==arr.length-i-1) sum2 += arr[i][j];
            }
        }
        System.out.println(sum1+" "+sum2);
    }
}
