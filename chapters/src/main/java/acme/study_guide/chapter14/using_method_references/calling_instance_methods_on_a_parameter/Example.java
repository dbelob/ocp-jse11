package acme.study_guide.chapter14.using_method_references.calling_instance_methods_on_a_parameter;

import java.util.function.BiPredicate;

public class Example {
    public static void main(String[] args) {
        BiPredicate<String, String> methodRef = String::startsWith;
        BiPredicate<String, String> lambda = (s, p) -> s.startsWith(p);
    }
}
