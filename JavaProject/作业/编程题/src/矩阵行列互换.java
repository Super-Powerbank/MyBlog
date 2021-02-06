import java.util.Scanner;

public class 矩阵行列互换 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int brr[][] = new  int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                brr[j][i]=arr[i][j];
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println("\t");
        }
    }
}
