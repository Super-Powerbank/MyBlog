import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println(false);
            return;
        }
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                System.out.println(false);
                return;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        System.out.println(true);
    }
}

