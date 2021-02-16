package acme.study_guide.chapter15.using_streams.creating_stream_sources.creating_infinite_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1,                // seed
                n -> n < 100,     // Predicate to specify when done
                n -> n + 2);      // UnaryOperator to get next value
        List<Integer> list = oddNumberUnder100
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
