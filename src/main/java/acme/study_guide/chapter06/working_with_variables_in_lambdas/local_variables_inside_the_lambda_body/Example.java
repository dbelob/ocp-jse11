package acme.study_guide.chapter06.working_with_variables_in_lambdas.local_variables_inside_the_lambda_body;

import java.util.function.Predicate;

public class Example {
    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a1 -> {
            int b1 = 0;
            int c = 0;
            return b == c;
        };
    }
}
