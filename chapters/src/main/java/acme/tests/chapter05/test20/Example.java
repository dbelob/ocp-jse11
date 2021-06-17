package acme.tests.chapter05.test20;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        var nums = new HashSet<Long>();
        nums.add((long) Math.min(5, 3));
        nums.add(Math.round(3.14));
        nums.add((long) Math.pow(4, 2));
        System.out.println(nums);
    }
}
