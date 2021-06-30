package acme.tests.chapter06.test072;

import java.util.List;

public class Example {
    public static void main(String[] strings) {
        var data = List.of(1, 2, 3);
        int f = data.parallelStream()
                .reduce(1, (a, b) -> a + b, (a, b) -> a + b);
        System.out.println(f);
    }
}
