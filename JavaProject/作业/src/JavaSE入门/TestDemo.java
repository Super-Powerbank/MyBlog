package JavaSE入门;

public class TestDemo {
    //求100~200的素数
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
//     S=a+aa+aaa+aaaa+...
//    public static int sum(int n){
//        int result = 0;
//          int a = 1;
//          int num=0;
//          for(int i=0;i<n;i++){
//              num+=Math.pow(10,i);
//              result +=a*num;
//          }
//          return result;
//    }
    //输出100~999之间的所有的水仙花数，所谓水仙花数始值一个3位数，其各种数字立方和等于该本身，例如：153是一个水仙花数。
//    public static int narcissisticNumber(int num){
//        int x=0;
//        int y=0;
//        int z=0;
//        x = num / 100;         //百位
//        y = num % 100 / 10;   //十位
//        z = num % 100 % 10;   //个位
//        if (num == x * x * x + y * y * y + z * z * z) {
//                return num;
//            }
//            return 0;
//        }
    //a b值互换
//    public static int exchange (int a,int b) {
//        int temp=0;
//        temp=a;
//        a=b;
//        b=temp;
//        return a;
//        }
//
        public static void main(String[] args) {
//        int a=exchange(10,20);
//        int b=exchange(10,20);
//        System.out.println("a:"+ a +"b:"+b);
//            //求100~200的素数

            for (int j = 100; j <= 200; j++) {
                if (isPrimer(j)) System.out.println(j+"是素数");
                else System.out.println(j+"不是素数");
            }
           // S=a+aa+aaa+aaaa+...
//       int result=sum(4);
//       System.out.println(result);
            //输出100~999之间的所有的水仙花数，所谓水仙花数始值一个3位数，其各种数字立方和等于该本身，例如：153是一个水仙花数。
//        for(int i=100;i<=999;i++){
//            int num=narcissisticNumber(i);
//            if (num!=0){
//                System.out.println(i);
//                }
//        }
//
//
//
//
//
    }
}
