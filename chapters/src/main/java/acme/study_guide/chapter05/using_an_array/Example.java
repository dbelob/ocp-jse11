package acme.study_guide.chapter05.using_an_array;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("numbers: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
        System.out.println("numbers: " + Arrays.toString(numbers));

        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb);
    }
}
