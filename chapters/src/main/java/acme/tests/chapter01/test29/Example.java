package acme.tests.chapter01.test29;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> {
            var newValue = "baby";
            return newValue;
        });
        System.out.println(babies);
    }
}
