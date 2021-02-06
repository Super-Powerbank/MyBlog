import java.util.Scanner;

public class 闰年 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0) {
                System.out.println("L");
            }
            else {
                System.out.println("N");
            }
        }
    }
