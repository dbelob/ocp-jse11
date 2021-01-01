package acme.study_guide.chapter09.creating_abstract_classes.defining_abstract_methods.constructors_in_abstract_classes;

public class Panda extends Bear {
    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Panda();
    }
}
