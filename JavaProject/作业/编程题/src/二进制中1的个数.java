import java.util.Scanner;

public class 二进制中1的个数 {
        public static int NumberOf1(int n) {
            if(n >= 0){
                String num = Integer.toBinaryString(n);
                return num.length() - num.replaceAll("1", "").length();
            }else{
                String num = Integer.toBinaryString(0 - n - 1);
                if(num.length() >= 32){
                    return 1;
                }
                return (32 - num.length()) + num.length() - num.replaceAll("0", "").length();
            }
//            public static int NumberOf1(int n) {
//                int count=0;
//                while(n!=0){
//                    count++;
//                    n=n&(n-1);
//                }
//                //System.out.println(count);
//                return count;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(NumberOf1(n));
    }
}

