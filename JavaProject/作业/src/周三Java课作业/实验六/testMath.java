package 周三Java课作业.实验六;

public class testMath {
    public static void main(String args[]) {
        final int NUMBER = 100;
        int count = 10;
        int randomNum = 0;
        int probability[] = new int[6];
        for (int i = 0; i < 6; i++) {
            probability[i] = 0;
        }
        for (int i = 0; i < NUMBER; i++) {
            randomNum = (int) (Math.random() * 6) + 1;
            probability[randomNum - 1]++;
            System.out.print(randomNum + "\t");
            if (i % count == 9)
                System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("\n" + (i + 1) + ":\t" + probability[i]);
        }
    }
}