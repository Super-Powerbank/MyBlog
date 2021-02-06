import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestDemo4 {
    //    public static void main(String[] args) {
//        File file = new File("a.txt");
//        File file1 = new File("b.txt");
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream(file);
//            fos = new FileOutputStream(file1);
//            byte[] buffer = new byte[1024];
//            int temp = -1;
//            while ((temp = fis.read(buffer)) != -1) {
//                fos.write(buffer, 0, temp);
//            }
////            int temp = -1;
////            while ((temp=fis.read())!=-1){
////                fos.write(temp);
////            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fis.close();
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("a.txt"), 1024);
            bos = new BufferedOutputStream(new FileOutputStream("b.txt"), 1024);

//        int temp =-1;
//        while ((temp =bis.read())!=-1){
//            bos.write(temp);
//        }
            byte[] buffer = new byte[1024];
            int temp = -1;
            while ((temp = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
