package acme.study_guide.chapter15.review_questions.question19;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.println(c.apply(1));
    }
}
