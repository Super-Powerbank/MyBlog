package 周三Java课作业.实验五;

public class Graduate extends Student {
    public Graduate(String name, String id, String className, int course1, int course2, int course3) {
        super(name, id, className, course1, course2, course3);
    }

    public void AverageScores() {
        int AverageScores = (super.getCourse1() + super.getCourse2() + super.getCourse3()) / 3;
        if (AverageScores >= 80) {
            System.out.println(getName() + "该研究生成绩合格，平均成绩：" + AverageScores);
        } else {
            System.out.println(getName() + "该研究生成绩不合格，平均成绩：" + AverageScores);
        }

    }
}
