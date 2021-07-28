package acme.tests.chapter09.test28;

import java.io.*;

class Student implements Serializable {
    transient int score = -1;
    String name;   public String toString() { return name + ":" + score; }
}

public class StudentManager {
    public static void main(String[] grades) {
        try (var ios = new ObjectInputStream(
                new FileInputStream(new File("s.data")))) {
            Student record;
            while ((record = (Student) ios.readObject()) != null)
                System.out.print(record);
        } catch (EOFException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
