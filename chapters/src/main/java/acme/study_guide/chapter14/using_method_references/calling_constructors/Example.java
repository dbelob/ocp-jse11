package acme.study_guide.chapter14.using_method_references.calling_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        Supplier<List<String>> methodRef0 = ArrayList::new;
        Supplier<List<String>> lambda0 = () -> new ArrayList();

        Function<Integer, List<String>> methodRef1 = ArrayList::new;
        Function<Integer, List<String>> lambda1 = x -> new ArrayList(x);
    }
}
