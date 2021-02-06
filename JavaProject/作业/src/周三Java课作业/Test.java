package 周三Java课作业;

public class Test {
    /**Java编程技术chapter3，CommentTest.java
     @author：kjw
     @data：2020/09/28
     */

    /**
     * 这是一个Java语言入门程序，定义类CommentTest。其中含有main()方法，因此可以作为一
     * 个应用程序单独执行。其功能是在默认的输出设备上输出字符串"Hi,你好！"。
     *
     *
     */
    //主方法，作为Java应用程序的默认入口。

    /**
     * 这是程序的入口函数
     *
     * @param args 这是调用参数
     */
//这是调用参数    public static void main(String args[]) {
//        System.out.println("Hi,你好！"); //输出"Hi,你好！"
//    }
    public static void main(String args[]) {
        char ch1 = '\b';
        char ch2 = '\t';
        char ch3 = '\n';
        char ch4 = '\r';
        char ch5 = '\"';
        char ch6 = '\'';
        char ch7 = '\\';
        System.out.println("沈阳" + ch1 + "师范大学");
        System.out.println("沈阳" + ch2 + "师范大学");
        System.out.println("沈阳" + ch3 + "师范大学");
        System.out.println("沈阳" + ch4 + ch3 + "师范大学");
        System.out.println(ch5 + "沈阳" + "师范大学" + ch5);
        System.out.println(ch6 + "沈阳" + "师范大学" + ch6);
        System.out.println(ch7 + "沈阳" + "师范大学" + ch7);
    }
}

