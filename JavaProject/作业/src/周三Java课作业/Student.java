package 周三Java课作业;

public class Student {
    private String StudentNumber;
    private String ClassNumber;
    private String name;
    private String sex;
    private int age;

    public Student(String studentNumber, String classNumber, String name, String sex, int age) {
        StudentNumber = studentNumber;
        ClassNumber = classNumber;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public String getClassNumber() {
        return ClassNumber;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return  "学号："+StudentNumber+" 班号："+ClassNumber+" 姓名："+name+" 性别："+sex+ " 年龄："+age;
    }
}
