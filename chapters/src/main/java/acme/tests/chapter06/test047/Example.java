package acme.tests.chapter06.test047;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] s) {
        var chars = Stream.generate(() -> 'a');
        chars.filter(c -> c < 'b')
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
    }
}
