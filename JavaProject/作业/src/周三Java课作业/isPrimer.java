package 周三Java课作业;

public class isPrimer {
    public static boolean isPrimer(int num) {
        {
            int i = 2;
            for (i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        for (int j = 200; j <= 300; j++) {
            if (isPrimer(j)) System.out.println(j+"是素数");
        }
    }
}
