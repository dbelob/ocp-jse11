package acme.study_guide.chapter18.review_questions.question13;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel()   // q1
                .reduce(0,
//                        (c1, c2) -> c1.length() + c2.length(),   // q2
                        (c1, c2) -> c1 + c2.length(),   // q2
                        (s1, s2) -> s1 + s2));   // q3
    }
}
