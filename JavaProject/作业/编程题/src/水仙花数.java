import java.util.Scanner;

public class 水仙花数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        if (i==0){
            return;
        }
        if(i<100||i>999){
            return;
        }
            int x=0;
            int y=0;
            int z=0;
            x = i/ 100;         //百位
            y = i % 100 / 10;   //十位
            z = i % 100 % 10;   //个位
            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
    }
}
