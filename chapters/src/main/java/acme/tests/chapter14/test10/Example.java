package acme.tests.chapter14.test10;

import java.util.TreeSet;

public class Example {
    public static void main(String... args) {
        var dice = new TreeSet<Integer>();
        dice.add(6);
        dice.add(6);
        dice.add(4);

        dice.stream()
                .filter(n -> n != 4)
//                .forEach(System.out::println)
                .peek(System.out::println)
                .count();
    }
}
