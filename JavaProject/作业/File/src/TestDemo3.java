import java.io.*;

public class TestDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("a.txt");
            writer = new FileWriter("b.txt");


            //定义一个char数组
//            char[] buf =new char[256];
//            int len = 0;
//            while ((len =reader.read(buf))!=-1){
//                writer.write(buf);
//            }
            int temp = -1;
            while ((temp = reader.read()) != -1) {
                writer.write(temp);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
