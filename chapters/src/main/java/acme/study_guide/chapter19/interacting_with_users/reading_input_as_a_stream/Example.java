package acme.study_guide.chapter19.interacting_with_users.reading_input_as_a_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You entered: " + userInput);
    }
}
