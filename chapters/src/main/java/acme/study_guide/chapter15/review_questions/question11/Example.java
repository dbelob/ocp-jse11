package acme.study_guide.chapter15.review_questions.question11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        System.out.println(
                Stream.iterate(1, x -> ++x)
                        .limit(5).map(x -> "" + x)
                        .collect(Collectors.joining())
        );
    }
}
