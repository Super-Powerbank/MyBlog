import java.io.*;

public class TestDemo2 {
    public static void main(String[] args) {
//        File file = new File("a.avi");
//        File file1 = new File("b.txt");
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream(file);
//            fos =new FileOutputStream(file1);
//
//            int temp =-1;
//            while ((temp = fis.read() )!= -1) {
//                fos.write(temp);
//            }
////            fos.write(fis.read());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fis.close();
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }



        //定义一个缓存缓存数组去拷贝
        FileOutputStream fos =null;
        FileInputStream fis = null;

        try {
           fos = new FileOutputStream("b.jpg");
            fis = new FileInputStream("a.jpg");
            byte[] bytes = new byte[1024];
            int temp = -1;
            //从源文件中去读取数据带缓存数组当中去
            while ((temp = fis.read(bytes))!=-1){
                //写入缓存数组当中的数据到目标文件中
                fos.write(bytes,0,temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
