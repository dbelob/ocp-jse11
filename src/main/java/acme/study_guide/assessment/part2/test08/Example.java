package acme.study_guide.assessment.part2.test08;

import java.io.Console;

public class Example {
    public static void main(String[] args) {
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.print("Your requested meal: " + line);
    }
}
