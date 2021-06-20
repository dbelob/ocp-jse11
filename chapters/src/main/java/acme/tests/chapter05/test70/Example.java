package acme.tests.chapter05.test70;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        Deque<String> q = new ArrayDeque<>();
        q.add("snowball");
        q.addLast("sugar");
        q.addFirst("minnie");

        System.out.println(q.peek() + " " + q.peek() + " " + q.size());
    }
}
