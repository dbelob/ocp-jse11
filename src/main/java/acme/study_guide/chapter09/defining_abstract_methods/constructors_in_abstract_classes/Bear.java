package acme.study_guide.chapter09.defining_abstract_methods.constructors_in_abstract_classes;

abstract class Bear {
    abstract CharSequence chew();

    public Bear() {
        System.out.println(chew());  // Does this compile?
    }
}
