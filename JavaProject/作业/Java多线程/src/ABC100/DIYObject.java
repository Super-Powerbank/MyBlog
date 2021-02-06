package ABC100;

public class DIYObject {
    private int index;//当前执行的线程编号  0  1  2
    private int count = 1;

    public int getIndex() {
        return index;
    }

    public void setIndex(int i) {
        index = i;
    }

}
