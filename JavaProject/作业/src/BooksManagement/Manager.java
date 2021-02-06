package BooksManagement;

public class Manager {
    private static String id;//职工号
    private static String phonenumber;//手机号
    private static String name;//姓名
    private static String sex;//性别
    private static String password;//密码


    static{
     id="123";
     phonenumber="18192223424";
     name="寇家伟";
     sex="男";
     password="123456";
    }

    public static String getId() {
        return id;
    }


    public static String getPhonenumber() {
        return phonenumber;
    }


    public static String getName() {
        return name;
    }


    public static String getSex() {
        return sex;
    }


    public static String getPassword() {
        return password;
    }

}
