package acme.tests.chapter05.test72;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
        var list = Arrays.asList("alpha", "beta", "gamma");
        var comparator1 = Comparator.comparing(String::length)
                .thenComparing(s -> s.charAt(0));
        var comparator2 = Comparator.comparing(String::length)
                .thenComparing(s -> s.charAt(0))
                .reversed();

        Collections.sort(list, comparator2);
        System.out.println(list.get(0));
    }
}
