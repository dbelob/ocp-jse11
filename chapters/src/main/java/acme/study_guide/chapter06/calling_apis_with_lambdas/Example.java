package acme.study_guide.chapter06.calling_apis_with_lambdas;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> bunnies = new HashMap<>();
        bunnies.put("long ear", 3);
        bunnies.put("floppy", 8);
        bunnies.put("hoppy", 1);
        bunnies.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
