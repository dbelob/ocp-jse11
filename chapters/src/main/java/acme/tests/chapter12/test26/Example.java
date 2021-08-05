package acme.tests.chapter12.test26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        var x = LocalDate.of(2022, 3, 1);
        var y = LocalDateTime.of(2022, 1, 1, 2, 55);
        var f = DateTimeFormatter.ofPattern("'yyyy-MM'");
        var g = DateTimeFormatter.ofPattern("yyyy-MM");
        System.out.println(f.format(x) + " " + f.format(y));
        System.out.println(g.format(x) + " " + g.format(y));
    }
}
