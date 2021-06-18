package acme.tests.chapter05.test30;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] array = {"Natural History", "Science"};
//        var museums = Arrays.asList(array);
        var museums = Arrays.asList("Natural History, Science");
//        var museums = new ArrayList<String>("Natural History", "Science");
        museums.set(0, "Art");

        System.out.println(museums.contains("Art"));
    }
}
