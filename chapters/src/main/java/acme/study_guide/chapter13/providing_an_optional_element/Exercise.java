package acme.study_guide.chapter13.providing_an_optional_element;

public @interface Exercise {
    int hoursPerDay();

    int startHour() default 6;
}
