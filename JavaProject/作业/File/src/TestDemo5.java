import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kjw");
        list.add("hwg");
        list.add("fy");
        list.add("fxl");

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            oos.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
