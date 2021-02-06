package JavaSE入门;

import java.util.Scanner;

public class TestDemo7 {
    public static int CyclicGame(int n) { //参数n为人数
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=i+1;
        }
        int count=0;
        int src=n;
        int index=0;

        while(n>1) {
            if (arr[index]!= -1) {
                count++;
            }
            if (count == 3) {
                arr[index] = -1;
                count = 0;
                n--;
            }
            index=++index%src;
        }
        for(int i=0;i<src;i++){
            if( arr[i]!=-1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(CyclicGame(n));
    }
}