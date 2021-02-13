package acme.study_guide.chapter14.review_questions.question11;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>(10);
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.get(4));
    }
}
