package acme.tests.chapter14.test28;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
    public void create() {
        List<?> n = new ArrayList<>();
//        List<? extends RuntimeException> o = new ArrayList<Exception>();
        List<? super RuntimeException> p = new ArrayList<Exception>();
//        List<T> q = new ArrayList<?>();
//        List<T extends RuntimeException> r = new ArrayList<Exception>();
//        List<T super RuntimeException> s = new ArrayList<Exception>();
    }
}
