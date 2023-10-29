abstract class Students implements java.io.Serializable {
    String name;
    int[] quiz_score = new int[15];
    int[] exam_score = new int[2];

    public Students(String name, int[] quiz_score) {
        this.name = name;
        this.quiz_score = quiz_score;
    }
}



