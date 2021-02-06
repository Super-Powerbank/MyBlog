package BooksManagement;

public class Student {
    private String id;//学号
    private String phonenumber;//手机号
    private String name;//姓名
    private String sex;//性别
    private String password;//密码

    public Student(String id, String phonenumber, String name, String sex, String password) {
        this.id = id;
        this.phonenumber = phonenumber;
        this.name = name;
        this.sex = sex;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
