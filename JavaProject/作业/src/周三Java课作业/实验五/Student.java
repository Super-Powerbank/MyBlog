package 周三Java课作业.实验五;

public class Student {
    private String name;
    private String id;
    private String ClassName;
    private int Course1;
    private int Course2;
    private int Course3;

    public Student(String name, String id, String className, int course1, int course2, int course3) {
        this.name = name;
        this.id = id;
        ClassName = className;
        Course1 = course1;
        Course2 = course2;
        Course3 = course3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getCourse1() {
        return Course1;
    }

    public void setCourse1(int course1) {
        Course1 = course1;
    }

    public int getCourse2() {
        return Course2;
    }

    public void setCourse2(int course2) {
        Course2 = course2;
    }

    public int getCourse3() {
        return Course3;
    }

    public void setCourse3(int course3) {
        Course3 = course3;
    }

    public void Scores() {
        System.out.println("学号：" + getId() + "姓名：" + getName() + "班级：" + getClassName() + "成绩1：" + getCourse1() + "成绩2：" + getCourse2() + "成绩3：" + getCourse3());
    }
}
