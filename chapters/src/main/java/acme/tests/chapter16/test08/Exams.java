package acme.tests.chapter16.test08;

import java.util.List;

public class Exams {
    public static void main(String[] args) {
        List<String> exams = List.of("1Z0-817", "1Z0-819");
        for (var e : exams)
            for (int i = exams.size(); i > 0; i -= 2)
                System.out.print(e + " " + exams.get(i));
        System.out.println();
    }
}
