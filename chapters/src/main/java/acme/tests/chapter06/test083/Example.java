package acme.tests.chapter06.test083;

import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Example {
    public static void main(String[] strings) {
        var bools = Stream.of(Boolean.TRUE, null);
        var map = bools
                .limit(1)    // line k
                .collect(partitioningBy(b -> b));
        System.out.println(map);
    }
}
