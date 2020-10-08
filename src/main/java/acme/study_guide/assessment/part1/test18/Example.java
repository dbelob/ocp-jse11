package acme.study_guide.assessment.part1.test18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
        System.out.println("C" + Arrays.compare(array,
                new int[]{6, 9, 8}));
        System.out.println("M" + Arrays.mismatch(array,
                new int[]{6, 9, 8}));
    }
}
