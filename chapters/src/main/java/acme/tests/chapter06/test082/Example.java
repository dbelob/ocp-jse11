package acme.tests.chapter06.test082;

import java.util.List;

public class Example {
    public static void main(String[] strings) {
        var p = List.of(new StringBuilder("hello"),
                new StringBuilder("goodbye"));
//        var q = p.parallelStream().reduce(0,
//                (w, x) -> w.length() + x.length(),
//                (y, z) -> y.length() + z.length());
//        System.out.print(q);
    }
}
