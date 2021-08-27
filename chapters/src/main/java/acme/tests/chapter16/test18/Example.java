package acme.tests.chapter16.test18;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        long sum = IntStream.of(4, 6, 8)
                .boxed()
                .parallel()
                .mapToInt(x -> x)
                .sum();
        System.out.print(sum);
    }
}
