package acme.study_guide.chapter19.interacting_with_users.printing_data_to_the_user;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        try (var in = new FileInputStream("zoo.txt")) {
            System.out.println("Found file!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}
