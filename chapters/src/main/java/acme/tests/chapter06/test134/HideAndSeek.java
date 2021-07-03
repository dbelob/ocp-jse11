package acme.tests.chapter06.test134;

import java.util.stream.Stream;

public class HideAndSeek {
    public static void main(String[] args) {
        var hide = Stream.of(true, false, true);
//        var found = hide.filter(b -> b).anyMatch(b -> b);
        var found = hide.filter(b -> b).allMatch(b -> b);
        System.out.println(found);
    }
}
