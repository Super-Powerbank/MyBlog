package JavaSE入门;

public class TestDemo1 {
//    头部添加一个value
//    public static int[] addHead(int[] arr,int value){
//        int[] tempArray={1,2,3};
//        for(int i=0;i<tempArray.length;i++){
//            arr[i+1]=tempArray[i];
//        }
//        arr[0]=value;
//        return arr;
//    }
    //尾部添加一个value
    public static int[] addTail(int[]arr,int value){
        int sum=0;
        int i=0;
        for( i=0;i<arr.length;i++){
            if(arr[i]!=0)
                sum++;
        }
        arr[sum]=value;
        return arr;
    }


    //头部添加一个value
//    public static void main(String[] args) {
//        int[] arr=new int[10];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        addHead(arr,0);
//        for (int i = 0; i < arr.length; i++) {
//            if(i<4)
//            System.out.println(arr[i]);
//        }
//    }
    //尾部添加一个value
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        addTail(arr,5);
        for ( int i= 0; i <arr.length; i++) {
            if(arr[i]>0)
            System.out.println(arr[i]);
        }
    }




}
