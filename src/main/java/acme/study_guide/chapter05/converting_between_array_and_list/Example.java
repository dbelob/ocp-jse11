package acme.study_guide.chapter05.converting_between_array_and_list;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(objectArray.length);     // 2
        System.out.println(stringArray.length);     // 2
    }
}
