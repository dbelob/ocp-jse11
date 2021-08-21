package acme.tests.chapter15.test18;

import java.util.LinkedList;

public class Example {
    public static void main(String... args) {
        var dice = new LinkedList<Integer>();
        dice.offer(3);
        dice.offer(2);
        dice.offer(4);
        System.out.print(dice.stream().filter(n -> n != 4));
    }
}
