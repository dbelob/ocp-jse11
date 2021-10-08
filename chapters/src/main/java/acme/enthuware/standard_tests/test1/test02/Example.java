package acme.enthuware.standard_tests.test1.test02;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1, 2, 3); //1
        names.forEach(x -> x = x + 1); //2
        names.forEach(System.out::println); //3
    }
}
