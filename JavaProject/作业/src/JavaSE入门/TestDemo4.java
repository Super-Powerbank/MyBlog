package JavaSE入门;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo4 {
    //输入字符串“i am a student.”,一个空格被替换为2个'#'; 最终结果 i##am##a##student
//    public static char[] change(char[] ch){
//        int count=0;
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]==' '){
//                count++;
//            }
//        }
//        char[] ch1=new char[ch.length+count];
//        for(int j=0;j<ch1.length;j++){
//            for (int i=j; i < ch.length; i++) {
//                if (ch[i] != ' ') {
//                    ch1[j] = ch[i];
//                }
//                else {
//                    ch1[j] = '#';
//                }break;
//            }
//        }
//        for (int j=ch1.length-1;j>=0;j--) {
//            if (ch1[j]== '#') {
//                for(int i=ch1.length-1;i>j;i--){
//                    ch1[i]=ch1[i-1];
//                }
//                ch1[j]='#';
//            }
//        }
//          return ch1;
//    }
    //例如输入“i am a student”,输出"student a am i"
//    public static char[] swap(char[] ch, int i, int j) {
//        char temp = 0;
//        while (i < j) {
//            temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        return ch;
//    }
//
//    public static char[] change(char[] ch) {
//        swap(ch, 0, ch.length - 1);
//        int index = 0;
//        for (int i = 0; i < ch.length - 1; i++) {
//            if (ch[i] == ' ') {
//                swap(ch, index, i - 1);
//                index = i + 1;
//            }
//        }
//        return ch;
//    }
    //打印三角形
//    public static int[][] fun(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                arr[i][0]=1;
//                arr[i][i]=1;
//            }
//        }
//        for (int i=2;i<arr.length;i++){
//            for (int j=1;j<arr[i].length;j++){
//                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//            }
//        }
//        return arr;
//    }









    //打印三角形
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][]arr=fun(new int[n][n]);
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("\t");
//        }
//
//    }
//输入字符串“i am a student.”,一个空格被替换为2个'#'; 最终结果 i##am##a##student
//    public static void main(String[] args){
//        String str="i am a student";
//        char[] ch=str.toCharArray();
//        char[] ch1=change(ch);
//        System.out.println(ch1);
//    }

    //例如输入“i am a student”,输出"student a am i"
//    public static void main(String[] args) {
//        String str = "i am a student";
//        char[] ch = str.toCharArray();
//        change(ch);
//        System.out.println(ch);
//    }



//i am a studnt空格变# 加强版
//    public static int getCharCount(char[] ch,char src){
//        int count = 0;
//        for(int i = 0;i<ch.length;i++){
//            if(ch[i] == src){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static char[] replace(String sentence,char src,int num,char aim){
//        char[] ch = sentence.toCharArray();
//        int srcLastIndex = ch.length-1;// 标记原来字符数组最后一个字符
//        int count = getCharCount(ch,src);
//        ch = Arrays.copyOf(ch,ch.length+count*(num-1));
//        //ch.length   新数组大小
//        int i=srcLastIndex,j = ch.length-1;//i 保存原来字符数组末端，j新数组末端
//        while (i>=0 && j>=0){
//            if(ch[i] == src){
//                for(int z = 0;z<num;z++) {
//                    ch[j--] = aim;
//                }
//                i--;
//            }else{
//                ch[j--] = ch[i--];
//            }
//        }
//        return ch;
//    }
//    public static void reverse(String str){
//        String[] arr = str.split(" ");
//        for(int i=0;i<arr.length/2;i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        // student a am i
//        String result = "";
//        for(int i=0;i<arr.length;i++){
//            if(i != arr.length-1) {
//                result += arr[i] + " ";
//            }else {
//                result += arr[i];
//            }
//        }
//    }

    //斐波那契数列
  public static int fabnicc(int n){
    if(n == 1 || n == 2){
        return 1;
    }
    int f1 = 1,f2 =1,result = 0;
    while (n-2>0) {
        result = f1 + f2;//2
        f1 = f2;
        f2 = result;
        n--;
    }
    return result;
}
    public static void main(String[] args) {
      int result=fabnicc(7);
        System.out.println(result);
//        char[] ch = replace("i am a studnet",' ',2,'#');
//        System.out.println(Arrays.toString(ch));
    }
}
