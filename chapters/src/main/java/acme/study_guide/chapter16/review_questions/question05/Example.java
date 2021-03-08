package acme.study_guide.chapter16.review_questions.question05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020–04–30",
                DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(date.getYear() + " "
                + date.getMonth() + " " + date.getDayOfMonth());
    }
}
