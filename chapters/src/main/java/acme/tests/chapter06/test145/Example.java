package acme.tests.chapter06.test145;

import java.util.List;

public class Example {
    public static void main(String[] strings) {
        List.of("one", "two", "bloat")
                .stream()
                .limit(1)
                .map(String::toUpperCase)       // line x
                .sorted()
                .forEach(System.out::println);
    }
}
