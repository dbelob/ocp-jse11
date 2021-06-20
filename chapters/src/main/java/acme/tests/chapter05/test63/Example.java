package acme.tests.chapter05.test63;

import java.util.Collection;

public class Example {
    public static void getExceptions(Collection<Exception> coll) {
        coll.add(new RuntimeException());
        coll.add(new Exception());
    }
}
// A. ?
// B. ? extends RuntimeException
// C. ? super RuntimeException
// D. None of the above
