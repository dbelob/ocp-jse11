package acme.tests.chapter05.test33;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
        var list = Arrays.asList("alpha", "beta", "gamma");
        Collections.sort(list, (s, t) -> t.compareTo(s));
//        Collections.sort(list, Comparator.reverseOrder());
        Collections.sort(list, Comparator.comparing((String s) -> s.charAt(0)).reversed());

        System.out.println(list.get(0));
    }
}
