package acme.tests.chapter06.test109;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        var stream = Stream.iterate(1, i -> i);

//        var b = stream.anyMatch(i -> i > 5);    // infinite
//        var b = stream.allMatch(i -> i > 5);    // false
        var b = stream.noneMatch(i -> i > 5);   // infinite

        System.out.println(b);
    }
}
