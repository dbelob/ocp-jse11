package acme.study_guide.chapter04.a_more_complex_example;

public class Example {
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
//            case middleName:  // DOES NOT COMPILE
//                id = 5;
//                break;
            case suffix:
                id = 0;
                break;
//            case lastName:    // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5:           // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J':         // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
//                id = 15;
//                break;
        }
        return id;
    }
}
