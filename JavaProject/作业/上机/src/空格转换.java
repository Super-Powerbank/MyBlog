public class 空格转换 {
    //输入字符串“i am a student.”,一个空格被替换为"%20"; 最终结果 i%20am%20a%20student
    public static char[] change(char[] ch){
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                count++;
            }
        }
        char[] ch1=new char[ch.length+2*count];
        for(int j=0;j<ch1.length;j++){
            for (int i=j; i < ch.length; i++) {
                if (ch[i] != ' ') {
                    ch1[j] = ch[i];
                }
                else {
                    ch1[j] = '0';
                }break;
            }
        }
        for (int j=ch1.length-1;j>=0;j--) {
            if (ch1[j]== '0') {
                for(int i=ch1.length-1;i>j;i--){
                    ch1[i]=ch1[i-1];
                }
                ch1[j]='2';
            }
        }
        for (int j=ch1.length-1;j>=0;j--) {
            if (ch1[j]== '2') {
                for(int i=ch1.length-1;i>j;i--){
                    ch1[i]=ch1[i-1];
                }
                ch1[j]='%';
            }
        }
          return ch1;
    }
    public static void main(String[] args){
        String str="i am a student";
        char[] ch=str.toCharArray();
        char[] ch1=change(ch);
        System.out.println(ch1);
    }
}
