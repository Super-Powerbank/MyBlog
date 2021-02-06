import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int f1 = 0, f2 = 1, result = 0;
        while (n > 1) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
            n--;
        }
        System.out.println(result);
    }
}


