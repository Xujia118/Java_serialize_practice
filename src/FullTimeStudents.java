public class FullTimeStudents extends Students implements java.io.Serializable {
    public FullTimeStudents(String name, int[] quiz_score,  int[] exam_score) {
        super(name, quiz_score);
        this.exam_score = exam_score;
    }
}