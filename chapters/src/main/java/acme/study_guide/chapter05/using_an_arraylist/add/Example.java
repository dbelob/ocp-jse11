package acme.study_guide.chapter05.using_an_arraylist.add;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");            // [hawk]
        birds.add(1, "robin");        // [hawk, robin]
        birds.add(0, "blue jay");     // [blue jay, hawk, robin]
        birds.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin]
        System.out.println(birds);    // [blue jay, cardinal, hawk, robin]
    }
}
