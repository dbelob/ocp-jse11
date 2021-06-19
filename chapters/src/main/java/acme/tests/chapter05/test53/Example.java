package acme.tests.chapter05.test53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // list.toArray()
        List<String> list1 = new ArrayList<>();
        list1.add("3");
        list1.add("2");
        list1.add("1");

        Object[] array1a = list1.toArray();
        String[] array1b = list1.toArray(new String[0]);
        array1b[0] = "7";
        System.out.println("array1b: " + Arrays.toString(array1b)); // array1b: [7, 2, 1]
        System.out.println("list1: " + list1);                      // list1: [3, 2, 1]

        // Arrays.asList(array)
        String[] array2 = new String[]{"3", "2", "1"};
        List<String> list2 = Arrays.asList(array2);
        list2.set(0, "7");
        System.out.println("array2: " + Arrays.toString(array2));   // array2: [7, 2, 1]
        System.out.println("list2: " + list2);                      // list2: [7, 2, 1]

        Collections.sort(list2);
        System.out.println("array2: " + Arrays.toString(array2));   // array2: [1, 2, 7]
        System.out.println("list2: " + list2);                      // list2: [1, 2, 7]
    }
}
