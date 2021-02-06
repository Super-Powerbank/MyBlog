package Book;

public class Student extends People{
    private String stu_id;//学生学号

    public Student(String id, String passwd) {
        super(id,passwd);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
