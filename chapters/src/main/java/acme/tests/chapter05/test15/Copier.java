package acme.tests.chapter05.test15;

import java.util.Arrays;

public class Copier {
    public static void main(String... original) {
//        String...copy = original;
//        Arrays.linearSort(original);
//        Arrays.search(original, "");
//        System.out.println(original.size() + " " + original[0]);

        String[] copy = original;
        Arrays.sort(original);
        Arrays.binarySearch(original, "");
        System.out.println(original.length + " " + original[0]);
    }
}
