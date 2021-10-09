package acme.enthuware.standard_tests.test1.test65;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("charles", "chuk", "cynthia", "cho", "cici");
        long x = names.stream().filter(name->name.length()>4).collect(Collectors.counting());
        System.out.println(x);
    }
}
