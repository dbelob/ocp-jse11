package acme.study_guide.chapter14.review_questions.question09;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

//        map.add("pi", 3.14159);
//        map.add("e", 2L);
//        map.add("log(1)", new Double(0.0));
//        map.add('x', new Double(123.4));

        map.put("pi", 3.14159);
//        map.put("e", 2L);
        map.put("log(1)", new Double(0.0));
//        map.put('x', new Double(123.4));
    }
}
