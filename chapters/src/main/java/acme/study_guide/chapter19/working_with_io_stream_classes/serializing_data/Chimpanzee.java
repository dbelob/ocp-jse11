package acme.study_guide.chapter19.working_with_io_stream_classes.serializing_data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Gorilla {
}

public class Chimpanzee implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    private int newField = 42;

    {
        this.age = 14;
    }

    public Chimpanzee() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Chimpanzee(String name, int age, char type) {
        this.name = name;
//        this.age = age;
        this.type = type;
    }

    static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee)
                    chimpanzees.add((Chimpanzee) object);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return chimpanzees;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        newField = 15;  // Set a default value of 15 if it's not in the serialized output file
        ois.defaultReadObject();
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                ", newField=" + newField +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        File dataFile = new File("chimpanzee.data");

//        saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }
}
