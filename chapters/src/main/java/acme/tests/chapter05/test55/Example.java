package acme.tests.chapter05.test55;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.clear();
        chars.remove(0);
        System.out.print(chars.isEmpty() + " " + chars.size());
    }
}
