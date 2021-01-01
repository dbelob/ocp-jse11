package acme.study_guide.chapter05.review_questions.question19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        int[] array = {6, -4, 12, 0, -10};
        Collections.sort(list);

        Integer converted[] = list.toArray(new Integer[4]);
        System.out.println(converted[0]);
        System.out.println(Arrays.binarySearch(array, 12));
    }
}
