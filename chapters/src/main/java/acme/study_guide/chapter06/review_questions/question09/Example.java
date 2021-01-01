package acme.study_guide.chapter06.review_questions.question09;

import java.util.List;

public class Example {
    public void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
//        char start = 'a';
//        char c = 'x';
//        chars = null;
    }
}
