package acme.study_guide.chapter15.review_questions.question06;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty);
//        var match = s.anyMatch(String::isEmpty);
//        var match = s.noneMatch(String::isEmpty);
        System.out.println(match);
    }
}
