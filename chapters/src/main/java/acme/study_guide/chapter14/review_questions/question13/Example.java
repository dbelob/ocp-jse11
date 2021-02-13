package acme.study_guide.chapter14.review_questions.question13;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
//        List<Number> list2 = new ArrayList<Integer>();
//        ArrayList<Number> list3 = new ArrayList<Integer>();
        ArrayList<? extends Number> list4 = new ArrayList<Integer>();
    }
}
