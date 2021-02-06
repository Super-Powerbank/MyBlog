package JavaSE入门;

public class TestDemo8 {
    public static void LeftRotateString(String str,int n){
        String s1 = str.substring(0,n);
        String s2 = str.substring(n,str.length());
        String s3=s2+s1;
        System.out.println(s3);
    }

    public static void main(String[] args) {
        LeftRotateString("abcdef",2);
    }
}
