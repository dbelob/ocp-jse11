package acme.enthuware.standard_tests.starter_test.test05;

import java.util.List;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
//        Consumer x = System.out::println;
        Consumer<String> x = (String msg)->{ System.out.println(msg); };

        List.of(args).forEach(x);
    }
}
