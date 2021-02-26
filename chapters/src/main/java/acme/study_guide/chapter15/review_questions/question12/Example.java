package acme.study_guide.chapter15.review_questions.question12;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {
        Supplier<String> x = String::new;               // F

//        Predicate<String> y = m.andThen(n);     // E

        BiConsumer<String, String> m = (a, b) -> {
        };
        BiConsumer<String, String> n = (a, b) -> {
        };
        BiConsumer<String, String> y = m.andThen(n);    // B

        UnaryOperator<String> z = a -> a + a;           // G
    }
}
