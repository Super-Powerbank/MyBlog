package 周三Java课作业.实验六;

import java.util.Scanner;

public class CaiMi {
    public static void caimi() {
        int count = 0;
        int x = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println("你猜的数字是：");
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
            count++;
            if (y < x) {
                System.out.println("猜小了");
            }
            if (y > x) {
                System.out.println("猜大了");
            }
            if (y == x) {
                System.out.println("猜中了,猜了" + count + "次");
                System.out.println(count);
                System.out.println("1.重新开始 2.退出");
                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();
                if (choose == 1) {
                    caimi();
                }
                if (choose == 2) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        caimi();
    }
}
