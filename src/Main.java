import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Instantiate students and session
        List<Students> students = PopulateStudents.create_session(studentList);
        Session session = new Session();

        // Required methods in Exercise1
        Operation.printAverageQuizScores(session, students);
        Operation.sortQuizScores(session, students);
        Operation.printPartTimeStudents(session, students);
        Operation.printExamScores(session, students);

        // Serialize
        Serialize.serializeStudents(students); // (a list containing 20 student objects)
        Serialize.serializeSession(session); //(it contains all the methods)

        // Deserialize
        // TODO

    }

    private static List<String> studentList = new ArrayList<>();
    static {
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        studentList.add("David");
        studentList.add("Eva");
        studentList.add("Frank");
        studentList.add("Grace");
        studentList.add("Hannah");
        studentList.add("Isaac");
        studentList.add("Jane");
        studentList.add("Katherine");
        studentList.add("Liam");
        studentList.add("Mia");
        studentList.add("Noah");
        studentList.add("Olivia");
        studentList.add("Peter");
        studentList.add("Quinn");
        studentList.add("Rachel");
        studentList.add("Samuel");
        studentList.add("Taylor");
    }
}