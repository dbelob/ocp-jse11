package acme.study_guide.chapter15.review_questions.question01;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
}
