package acme.study_guide.chapter05.using_an_arraylist.remove;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");     // [hawk]
        birds.add("hawk");     // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk"));     // prints true
        System.out.println(birds.remove(0));          // prints hawk
        System.out.println(birds);                    // []

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);     // [0]
        numbers.add(42);     // [0, 42]
//        System.out.println(numbers.remove(0)); // prints 0
        System.out.println(numbers.remove(Integer.valueOf(0))); // prints 0
    }
}
