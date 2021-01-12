package acme.study_guide.chapter12.creating_nested_classes.defining_an_anonymous_class;

public class Gorilla {
    interface Climb {
    }

    Climb climbing = new Climb() {
    };
}
