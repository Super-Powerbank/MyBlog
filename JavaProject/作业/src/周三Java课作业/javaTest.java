package 周三Java课作业;

class Point{
    double x,y;
    public void setXY(double a,double b){
        x=a;
        y=b;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void disp(){
        System.out.println("点的当前坐标为：("+x+", "+y+")");
    }
};
public class javaTest{
    public static void main(String[] args){
        Point p1=new Point();
        p1.disp();
        p1.setXY(3.2,5.6);
        p1.disp();
    }
}