package acme.tests.chapter06.test040;

import java.util.List;

public class Example {
    public static void main(String[] s) {
        var list = List.of('c', 'b', 'a');

        list.stream()
                .sorted()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println(list.stream().sorted().findFirst());
    }
}
