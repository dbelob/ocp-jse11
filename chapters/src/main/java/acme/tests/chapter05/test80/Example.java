package acme.tests.chapter05.test80;

import java.util.Collection;

public class Example {
    public static void getExceptions(Collection<? super Exception> coll) {
        coll.add(new RuntimeException());
        coll.add(new Exception());
    }
}
// A. ?
// B. ? extends Exception
// C. ? super Exception
// D. None of the above
