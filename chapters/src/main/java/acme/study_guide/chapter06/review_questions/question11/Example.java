package acme.study_guide.chapter06.review_questions.question11;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("leo");
        cats.add("Olivia");

        cats.sort((c1, c2) -> -c1.compareTo(c2)); // line X
        System.out.println(cats);
    }
}
