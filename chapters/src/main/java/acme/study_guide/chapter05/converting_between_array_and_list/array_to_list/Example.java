package acme.study_guide.chapter05.converting_between_array_and_list.array_to_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void arrayToList1() {
        // Returns fixed size mutable list
        String[] array = {"hawk", "robin"};     // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size());         // 2
        list.set(1, "test");                     // [hawk, test]
        array[0] = "new";                        // [new, test]
        System.out.println(Arrays.toString(array));// [new, test]
        list.remove(1);     // throws UnsupportedOperationException
    }

    public static void arrayToList2() {
        // Returns immutable list
        String[] array = {"hawk", "robin"};         // [hawk, robin]
        List<String> list = List.of(array);         // returns immutable list
        System.out.println(list.size());            // 2
        array[0] = "new";
        System.out.println(Arrays.toString(array)); // [new, robin]
        System.out.println(list);                   // [hawk, robin]
        list.set(1, "test");      // throws UnsupportedOperationException
    }

    public static void main(String[] args) {
        // Returns fixed size mutable list
        try {
            arrayToList1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Returns immutable list
        try {
            arrayToList2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Use varargs
        List<String> list1 = Arrays.asList("one", "two");   // returns fixed size list
        List<String> list2 = List.of("one", "two");         // returns fixed size list

        // Returns mutable list
        String[] stringArray = new String[]{"1", "2"};
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
    }
}
