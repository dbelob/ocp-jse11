package acme.tests.chapter06.test098;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        var s = Stream.of("over the river",
                "through the woods",
                "to grandmother's house we go");

        s.filter(n -> n.startsWith("t"))
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
