package acme.study_guide.chapter06.working_with_variables_in_lambdas.variables_referenced_from_the_lambda_body;

import java.util.function.Consumer;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
//        name = "Caty";
        color = "black";

        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
//        volume = "softly";
    }
}
