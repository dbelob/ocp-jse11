package acme.study_guide.chapter14.review_questions.question03;

import java.util.List;

public class Example {
    public static void main(String[] args) {
//        List<?> q = List.of("mouse", "parrot");
        List<String> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
    }
}
