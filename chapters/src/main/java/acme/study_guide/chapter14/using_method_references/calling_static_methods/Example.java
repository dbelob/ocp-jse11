package acme.study_guide.chapter14.using_method_references.calling_static_methods;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);
    }
}
