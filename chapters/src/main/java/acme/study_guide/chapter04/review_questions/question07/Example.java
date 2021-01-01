package acme.study_guide.chapter04.review_questions.question07;

import java.time.DayOfWeek;

public class Example {
    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch(otherDay) {
            default:
//            case 1: continue;
//            case thursday: return DayOfWeek.THURSDAY;
            case 2: break;
//            case Sunday: return DayOfWeek.SUNDAY;
//            case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}
