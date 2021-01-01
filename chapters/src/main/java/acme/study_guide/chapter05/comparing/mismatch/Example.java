package acme.study_guide.chapter05.comparing.mismatch;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));
    }
}
