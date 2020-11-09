package acme.study_guide.chapter05.creating_an_array_of_primitives;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[]{42, 55, 99};
        int[] numbers3 = {42, 55, 99};

        System.out.println("numbers1: " + numbers1.toString());
        System.out.println("numbers2: " + numbers2.toString());
        System.out.println("numbers3: " + numbers3.toString());

        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
    }
}
