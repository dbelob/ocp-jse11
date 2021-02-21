package acme.study_guide.chapter15.working_with_advanced_stream.linking_streams_to_the_underlying_data;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        var cats = new ArrayList<String>();

        cats.add("Annie");
        cats.add("Ripley");

        var stream = cats.stream();

        cats.add("KC");

        System.out.println(stream.count());
    }
}
