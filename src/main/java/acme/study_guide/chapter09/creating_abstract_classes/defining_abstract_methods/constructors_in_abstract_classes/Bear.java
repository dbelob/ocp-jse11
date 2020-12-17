package acme.study_guide.chapter09.creating_abstract_classes.defining_abstract_methods.constructors_in_abstract_classes;

abstract class Bear {
    abstract CharSequence chew();

    public Bear() {
        System.out.println(chew());  // Does this compile?
    }
}
