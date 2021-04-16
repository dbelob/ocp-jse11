package acme.study_guide.chapter19.interacting_with_users.acquiring_input_with_console;

import java.io.Console;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }
    }
}
