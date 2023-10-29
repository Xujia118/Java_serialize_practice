import java.util.List;

public class Operation {
    public static void printAverageQuizScores(Session session, List<Students> students) {
        List<List<Object>> quiz_result = session.get_average_score_per_student(students);

        System.out.println("Average quiz score per student");
        for (List<Object> each_student: quiz_result) {
            String name = (String) each_student.get(0);
            Double score = (Double) each_student.get(1);

            System.out.println(name);
            System.out.printf("%.1f%n", score);
        }
    }

    public static void sortQuizScores(Session session, List<Students> students) {
        List<List<Object>> sorted_quiz_result = session.sort_quiz_scores(students);
        System.out.println("Average quiz score per student by ascending order");
        for (List<Object> each_student: sorted_quiz_result) {
            String name = (String) each_student.get(0);
            Double score = (Double) each_student.get(1);

            System.out.println(name);
            System.out.printf("%.1f%n", score);
        }
    }

    public static void printPartTimeStudents(Session session, List<Students> students) {
        System.out.println("Printing part-time students");
        session.print_part_time_students(students);
    }

    public static void printExamScores(Session session, List<Students> students) {
        System.out.println("Printing exam scores of full-time students");
        session.get_exam_scores(students);
    }
}
