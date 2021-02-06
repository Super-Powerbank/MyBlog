import java.util.Scanner;

public class 几个a相加 {
        public static void main(String[] args){
            int j=0;
            int a=2;
            int sum=0;
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            for(int i=1;i<=n;i++){
                j=j*10+1;
                sum+=a*j;
            }
            System.out.println(sum);
        }

}
