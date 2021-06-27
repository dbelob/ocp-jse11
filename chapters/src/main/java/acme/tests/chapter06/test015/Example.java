package acme.tests.chapter06.test015;

import java.util.List;
import java.util.function.ToIntFunction;

public class Example {
    public static void main(String[] args) {
        ToIntFunction<Integer> transformer = x -> x;

        var prime = List.of(3, 1, 4, 1, 5, 9)
                .stream()
                .limit(1)
                .peek(s -> {
                })
                .mapToInt(transformer)
                .peek(s -> {
                })
                .sum();
        System.out.println(prime);
    }
}
