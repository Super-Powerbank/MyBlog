import java.io.File;
import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        File dir = new File("D:/新建文件夹");
        dir.mkdir();
        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.delete(dir);
    }
    public void delete(File file) {
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (int i = 0; i < subs.length; i++) {
                delete(subs[i]);
            }
        }
        //删除空的文件夹
        file.delete();
        System.out.println("删除成功");
    }
//}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入文件夹路径：");
//        while (true) {
//            String Line = scanner.nextLine();
//            File dir = new File(Line);
//            if (!dir.exists()) {
//                System.out.println("路径不存在");
//            } else if (dir.isFile()) {
//                System.out.println("输入的是文件路径");
//            } else {
//                File[] allFiles = dir.listFiles();
//                for (File allFile : allFiles) {
//                    if (allFile.isFile() && allFile.getName().endsWith(".java")) {
//                        System.out.println(allFile);
//                    }
//                }
//            }
//        }
    }





//-------------------------------------------------------------------------------------------------------------------------------------------------
//答案
//----------------------------------------------------------------------------------------------------------------------------------------------------

///【IO】从键盘输入一个文件夹路径，打印出该文件夹下所有.java的文件名/文件对象
//public static void printJavaFile(File dir) {
//    //获取到该文件夹路径下的所有的文件和文件夹，存储在File数组中
//    File[] subFiles = dir.listFiles();
//    //遍历对每一个文件或文件夹做判断
//    for (File subFile : subFiles) {
//        //如果是文件，并且后缀是.java的，就打印
//        if (subFile.isFile() && subFile.getName().endsWith(".java")) {
//            System.out.println(subFile);
//            //反之如果是文件夹，就递归调用
//        } else if (subFile.isDirectory()) {
//            printJavaFile(subFile);
//        }
//    }
//}
//
//
//    public static void main(String[] args) {
//        //从键盘输入一个文件夹路径，打印出该目录下所有.java的文件名/文件对象
//        Scanner sc = new Scanner(System.in);//创建键盘录入对象
//        System.out.println("请输入一个文件夹路径");
//        while (true) {
//            String line = sc.nextLine();//将键盘录入的文件夹路径存储
//            File dir = new File(line);//封装成File对象
//            if (!dir.exists()) {
//                System.out.println("您录入的文件夹路径不存在,请重新录入");
//            } else if (dir.isFile()) {
//                System.out.println("您录入的是文件路径,请重新录入文件夹路径");
//            } else {
//                printJavaFile(dir);
//                break;
//            }
//        }


//【IO】如何删除多级文件夹？用代码实现
//public static void remove(File file){
//    if(file == null || !file.exists()){
//        return;
//    }
//
//    //当前文件对象是一个文件
//    if(file.isFile()){
//        file.delete();
//    }
//
//    //反之当前文件对象是一个目录
//    deleteDir(file);
//}
//
//    public static void deleteDir(File dir){
//        //列出该目录下所有文件对象
//        File[] files = dir.listFiles();
//        if(files == null) {
//            return;
//        }
//        //遍历该文件对象的集合，判断如果该文件对象是一个文件则直接删除，反之则递归调用
//        for(File f: files){
//            if(f.isFile()){
//                f.delete();
//            }else{
//                deleteDir(f);
//            }
//        }
//        //最后调用delete删除空的目录
//        dir.delete();
//    }
//
//    public static void main(String[] args) {
//        //删除多级文件夹
//        File file = new File("./aaa/");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        remove(file);
//    }