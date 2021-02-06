package JavaSE入门;

import java.util.Scanner;

public class TestDemo0 {
    public static void main(String[] args){
        //判断100~200之间哪些是素数 哪些不是
//        int i;
//        int j;
//        for (i=100;i<=200;i++) {
//        for (j=2; j<i;j++) {
//                if(i%j == 0)
//                break;}
//                if(j>=i) System.out.println(i+"不是素数");
//                else  System.out.println(i+"是素数");
//                }



        // 1-1/2+1/3-1/4+1/5-...1/n   键盘获取n   结果小数
        double sum1=0.0;
        double sum2=0.0;
        double sum=0.0;
        int i;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0) {
                sum1=sum1+(1.0/i);
            }else {
                sum2=sum2+(1.0/i);
            }
        }
        sum=sum2-sum1;
        System.out.println(sum);





      //int a = 1,  从键盘上输入n   result = a+aa+aaa+aaaa+...n部分加
//        int j=0;
//        int a=1;
//        int sum=0;
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        for(int i=1;i<=n;i++){
//            j=j*10+1;
//            sum+=a*j;
//        }
//            System.out.println(sum);
    }
}
