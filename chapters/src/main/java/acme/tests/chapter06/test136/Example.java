package acme.tests.chapter06.test136;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] strings) {
        Predicate<String> pred1 = (final String s) -> s.isEmpty();
//        Predicate<String> pred2 = (final s) -> s.isEmpty();
        Predicate<String> pred3 = (final var s) -> s.isEmpty();
        Predicate<String> pred4 = (String s) -> s.isEmpty();
        Predicate<String> pred5 = (var s) -> s.isEmpty();
    }
}
