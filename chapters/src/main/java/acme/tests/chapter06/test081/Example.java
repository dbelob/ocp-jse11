package acme.tests.chapter06.test081;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] strings) {
//        Consumer<Object> c1 = ArrayList::new;
//        Consumer<Object> c2 = String::new;
        Consumer<Object> c3 = System.out::println;

//        var c4 = ArrayList::new;
//        var c5 = String::new;
//        var c6 = System.out::println;
    }
}
