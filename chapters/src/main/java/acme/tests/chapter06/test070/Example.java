package acme.tests.chapter06.test070;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        var stream = Stream.of("base", "ball");
//        stream.mapToInt(s -> s.length()).forEach(System.out::print);
        stream.map(s -> s.length()).forEach(System.out::print);
    }
}
