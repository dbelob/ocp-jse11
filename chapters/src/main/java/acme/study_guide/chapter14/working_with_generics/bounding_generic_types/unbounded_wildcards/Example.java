package acme.study_guide.chapter14.working_with_generics.bounding_generic_types.unbounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();
    }
}
