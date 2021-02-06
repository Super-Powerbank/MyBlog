
import java.io.*;
import java.util.RandomAccess;

public class TestDemo6 {
//    public static void main(String[] args) {
//        RandomAccessFile raf = null;
//
//        try {
//            raf =new RandomAccessFile("a.txt","rw");
//            raf.seek(500);
//
//            byte [] buffer =new  byte[1024];
//            int temp = -1;
//            while ((temp=raf.read(buffer))!=-1){
//
//                System.out.println(new String(buffer,0,temp));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) {
        RandomAccessFile raf = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            raf = new RandomAccessFile("a.txt", "rw");
            fis = new FileInputStream("temp.txt");
            fos = new FileOutputStream("temp.txt");
            //移动下标到指定位置，并把该位置之后的数据存到缓存文件中
            raf.seek(256);
            byte[] buffer = new byte[1024];
            int temp = -1;
            while ((temp = raf.read(buffer)) != -1) {
                fos.write(buffer, 0, temp);
            }
            //再次将下标移动到指定位置，并把数据插入到里面
            raf.seek(256);
            String s = "西安图论软件科技有限公司";
            byte[] a = s.getBytes();
            raf.write(a);
            //将缓存文件中的内容插入
            while ((temp = fis.read(buffer)) != -1) {
                raf.write(buffer, 0, temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
