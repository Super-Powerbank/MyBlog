package Book_Management;

public class Student extends People{
    private String stu_name;

    public Student(String studentName,String id, String passwd) {
        super(id,passwd);
        this.stu_name = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student)obj;
            if (this.getId().equals(student.getId())
                    &&getPasswd().equals(student.getPasswd())
                    &&stu_name.equals(student.stu_name)){
                return true;
            }
        }
        return false;
    }
}
