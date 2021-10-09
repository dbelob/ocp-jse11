package acme.enthuware.standard_tests.test1.test63;

import java.util.Optional;

public class FunWithOptional {
    public static String getValue() {
        return null;
    }

    public static void main(String[] args) {
//        Optional<String> stro = Optional.of(getValue());//1
        Optional<String> stro = Optional.ofNullable(getValue());//1
        System.out.println(stro.isPresent());//2
//        System.out.println(stro.get());//3
        System.out.println(stro.orElse(null));//4
    }
}
