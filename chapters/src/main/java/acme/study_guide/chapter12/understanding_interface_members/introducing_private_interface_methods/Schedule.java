package acme.study_guide.chapter12.understanding_interface_members.introducing_private_interface_methods;

public interface Schedule {
    default void wakeUp() {
        checkTime(7);
    }

    default void haveBreakfast() {
        checkTime(9);
    }

    default void haveLunch() {
        checkTime(12);
    }

    default void workOut() {
        checkTime(18);
    }

    private void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have " + (17 - hour) + " hours left "
                    + "to make the appointment");
        }
    }
}
