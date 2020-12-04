package acme.study_guide.chapter08.inheriting_members.inheriting_methods.review_of_overloading_a_generic_method;

import java.util.List;

public class Anteater extends LongTailAnimal {
//    protected void chew(List<Double> input) {
//    }  // DOES NOT COMPILE

    protected void chew2(List input) {
    }

    protected void chew3(List<Object> input) {
    }

//    protected void chew4(List<Object> input) {
//    }
}
