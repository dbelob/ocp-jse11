package acme.tests.chapter05.test06;

import java.util.ArrayDeque;

public class Example {
    public static void main(String[] args) {
        var q = new ArrayDeque<String>();
        q.offer("snowball");
        q.offer("minnie");
        q.offer("sugar");

        System.out.println(q.peek() + " " + q.peek() + " " + q.size());
    }
}
