import java.util.Scanner;

public class 二进制一的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
