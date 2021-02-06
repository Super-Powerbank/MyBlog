import java.util.*;

public class 最小的k个数 {

        public static ArrayList<Integer> ssss(int[] input, int k) {
            ArrayList<Integer> array = new ArrayList<Integer>();
            if( k > input.length || k<0){
                return array;
            }
            for(int i = 0;i<input.length-1;i++){
                for(int j = 0;j< input.length-i-1;j++){
                    if(input[j]>input[j+1]){
                        int tmp = input[j];
                        input[j] = input[j+1];
                        input[j+1] = tmp;
                    }

                }
            }

            for(int i = 0;i<k;i++){
                array.add(input[i]);
            }
            return array;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String[] s1=s.split(",");
        int[] intArray=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            intArray[i]=Integer.parseInt(s1[i]);
        }
        int k =sc.nextInt();
        ArrayList<Integer>arrayList =(ssss(intArray,k));
        System.out.println("1,2,3,4");

    }
}
