package acme.tests.chapter06.test087;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] strings) {
        IntSummaryStatistics stats = Stream.of(20, 40)
                .mapToInt(i -> i)
                .summaryStatistics();
        long total = stats.getSum();
        long count = stats.getCount();
        long max = stats.getMax();
        System.out.println(total + "-" + count + "-" + max);
    }
}
