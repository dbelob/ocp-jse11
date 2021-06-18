package acme.tests.chapter05.test43;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
//        var list = List.of("alpha", "beta", "gamma");
        var list = Arrays.asList("alpha", "beta", "gamma");
        Collections.sort(list, Comparator.comparing(String::length));
        System.out.println(list.get(0));
    }
}
