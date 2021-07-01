package acme.tests.chapter06.test084;

import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        var apples = List.of(1, 2);
        var oranges = List.of(1, 2);
        final var count = Stream.of(apples, oranges)
//                .flatMapToInt(List::stream)
//                .flatMapToInt(integers -> integers.stream())
                .flatMapToInt(integers -> integers.stream().mapToInt(Integer::intValue))
                .peek(System.out::print)
                .count();
        System.out.print(count);
    }
}
