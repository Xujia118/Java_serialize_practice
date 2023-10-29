import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialize {
    public static void serializeStudents(List<Students> students) {
        try {
            FileOutputStream fileOut = new FileOutputStream("studentList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(students);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./studentList.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void serializeSession(Session session) {
        try {
            FileOutputStream fileOut = new FileOutputStream("session.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(session);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./session.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
