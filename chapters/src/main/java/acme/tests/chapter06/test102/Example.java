package acme.tests.chapter06.test102;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] strings) {
        var s = "fish";
        Predicate<String> pred = (a) -> s.contains(a);
        System.out.println(pred.test("fish" /*, "is"*/));
    }
}
