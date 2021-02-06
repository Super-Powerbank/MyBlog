import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) {
        //练习1：创建两个文件对象，分别使用相对路径和绝对路径去创建
        File file1 = new File("./a.txt");
        File file2 = new File("/Users/lvting/b.txt");
        //练习2：检查文件是否存在，不存在创建新文件
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //练习3：创建单级目录 aaa/
        File file3 = new File("./aaa");
        file3.mkdir();
        //练习4：创建多级目录 aaa/bbb/ccc/
        File file4 = new File("./bbb/ccc/ddd");
        file4.mkdirs();
        //练习5：删除文件和目录
        file1.delete();
        file2.delete();
        file3.delete();
        file4.delete();//删除多级目录？
        //练习6：获取文件信息，包括文件名、文件大小、文件的绝对路径、文件的父路径
        File file = new File("./test.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        //练习7：目录或文件的判断
        if(file.isFile()){
            System.out.println("它是一个文件");
        }else{
            System.out.println("它是一个目录");
        }
        //练习8：获取目录
        File dir = new File("/Users/lvting/aaa");
        dir.mkdir();

        File[] files = dir.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
//        public static void main(String[] args){
//            FileOutputStream fos = null;
//            try {
//                fos  = new FileOutputStream("b.txt");
//                //fos.write(33);
//                byte[] bytes = {33, 34, 35, 36, 37, 38};
//                fos.write(bytes);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//
//                }}}
}

