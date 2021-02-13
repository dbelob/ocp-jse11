package acme.study_guide.chapter14.review_questions;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

        // {1=10, 2=20, 3=null}

        map.merge(1, 3, (a, b) -> a + b);

        // {1=13, 2=20, 3=null}

        map.merge(3, 3, (a, b) -> a + b);

        // {1=13, 2=20, 3=3}

        System.out.println(map);
    }
}
