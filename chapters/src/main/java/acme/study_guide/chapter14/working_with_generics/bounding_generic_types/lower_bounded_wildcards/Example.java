package acme.study_guide.chapter14.working_with_generics.bounding_generic_types.lower_bounded_wildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<Exception>();
//        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }
}
