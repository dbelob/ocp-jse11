package acme.enthuware.standard_tests.last_day_test.test33;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13);
        double av = strm1
                .filter(x -> {
                    if (x > 10) return true;
                    else return false;
                }) //1
//                .peek() //2
                .collect(Collectors.averagingInt(y -> y)); //3
        System.out.println(av);
    }
}
