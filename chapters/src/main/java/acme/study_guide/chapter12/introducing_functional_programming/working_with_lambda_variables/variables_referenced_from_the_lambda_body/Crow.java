package acme.study_guide.chapter12.introducing_functional_programming.working_with_lambda_variables.variables_referenced_from_the_lambda_body;

import java.util.function.Predicate;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        color = "allowed";
//        name = "not allowed";
//        volume = "not allowed";
        Predicate<String> p =
                s -> (name + volume + color).length() == 9; // DOES NOT COMPILE
    }
}
