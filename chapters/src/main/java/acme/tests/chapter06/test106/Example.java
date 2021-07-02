package acme.tests.chapter06.test106;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example {
    public static void main(String[] strings) {
        var mitchsWorkout = new CopyOnWriteArrayList<Integer>();
        List.of(1, 5, 7, 9).stream().parallel()
                .forEach(mitchsWorkout::add);
//        mitchsWorkout
//                .forEachOrdered(System.out::print);  // q1
        mitchsWorkout.stream().parallel()
                .forEachOrdered(System.out::print);  // q1
        List.of(1, 5, 7, 9).stream().parallel()
                .forEachOrdered(System.out::print);  // q2
    }
}
