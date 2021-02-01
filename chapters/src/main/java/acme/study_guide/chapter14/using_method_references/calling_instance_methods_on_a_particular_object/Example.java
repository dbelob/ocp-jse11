package acme.study_guide.chapter14.using_method_references.calling_instance_methods_on_a_particular_object;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        var str = "abc";
        Predicate<String> methodRef0 = str::startsWith;
        Predicate<String> lambda0 = s -> str.startsWith(s);

        var random = new Random();
        Supplier<Integer> methodRef1 = random::nextInt;
        Supplier<Integer> lambda1 = () -> random.nextInt();
    }
}
