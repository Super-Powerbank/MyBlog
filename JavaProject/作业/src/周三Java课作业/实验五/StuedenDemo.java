package 周三Java课作业.实验五;

public class StuedenDemo {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("寇家伟", "1831050100", "计本1802", 95, 90, 98);
        Undergraduate undergraduate = new Undergraduate("寇家伟", "1831050100", "计本1802", 95, 94, 92);
        graduate.AverageScores();
        undergraduate.AverageScores();
    }
}
