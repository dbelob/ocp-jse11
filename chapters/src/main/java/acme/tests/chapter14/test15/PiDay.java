package acme.tests.chapter14.test15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PiDay {
    public static void main(String[] args) {
        LocalDateTime pi = LocalDateTime.of(2017, 3, 14, 1, 59);
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("m.ddhh'MM'");
        System.out.print(formatter.format(pi));
    }
}
