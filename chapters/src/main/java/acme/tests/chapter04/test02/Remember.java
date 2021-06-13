package acme.tests.chapter04.test02;

import java.io.IOException;

public class Remember {
    public static void think() throws Exception {  // k1
        try {
            throw new Exception();
        } catch (RuntimeException r) {}               // k2
    }
    public static void main(String... ideas) throws Exception {
        think();
    }
}
