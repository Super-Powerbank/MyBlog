import java.util.Scanner;

public class 猴子吃桃 {
    public static void main(String[] args) {
        int eat = 1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i =1;
        while (i<x){
                eat = (int) (eat + 3*(Math.pow(2,i-1)));
                i++;
        }
        System.out.println(eat);
    }
}

