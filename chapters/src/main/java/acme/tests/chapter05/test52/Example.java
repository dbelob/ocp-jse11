package acme.tests.chapter05.test52;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("1");
        a1.add(null);

        List<String> a2 = new LinkedList<>();
        a2.add("1");
        a2.add(null);

        Set<String> a3 = new HashSet<>();
        a3.add("1");
        a3.add(null);

        Set<String> a4 = new TreeSet<>();
        a4.add("1");
//        a4.add(null);
    }
}
