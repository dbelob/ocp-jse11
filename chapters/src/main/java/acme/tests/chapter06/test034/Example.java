package acme.tests.chapter06.test034;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] s) {
//        Predicate dash = c -> c.startsWith("-");
        Predicate<String> dash = c -> c.startsWith("-");
        System.out.println(dash.test("–"));

        Consumer clear = x -> System.out.println(x);
        clear.accept("pink");

//        Comparator<String> c = (String s, String t) -> 0;
        Comparator<String> c = (String s2, String t) -> 0;
        System.out.println(c.compare("s", "t"));
    }
}
