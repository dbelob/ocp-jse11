package acme.tests.chapter06.test004;

import java.util.List;

public class Bounce {
    public static void main(String... legend) {
        List.of(1, 2, 3, 4).stream()
                .forEach(System.out::println);

//        List.of(1, 2, 3, 4).parallel()
//                .forEach(System.out::println);
        List.of(1, 2, 3, 4).parallelStream()
                .forEach(System.out::println);

//        List.of(1, 2, 3, 4).parallel()
//                .forEachOrdered(System.out::println);
        List.of(1, 2, 3, 4).parallelStream()
                .forEachOrdered(System.out::println);
    }
}
