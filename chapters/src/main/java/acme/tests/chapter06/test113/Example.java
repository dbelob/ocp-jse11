package acme.tests.chapter06.test113;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        Stream<Integer> s1 = Stream.of(8, 2);
        Stream<Integer> s2 = Stream.of(10, 20);
        s2 = s1.filter(n -> n > 4);
        s1 = s2.filter(n -> n < 1);
        System.out.println(s1.count());
        System.out.println(s2.count());
    }
}
