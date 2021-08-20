package acme.tests.chapter15.test09;

import java.io.IOException;

class Music {
    void make() throws IOException {
        throw new UnsupportedOperationException();
    }
}
public class Sing extends Music {
//    public void make() throws Exception {
//    public void make() throws Throwable {
    public void make() throws RuntimeException {
        System.out.println("do-re-mi-fa-so-la-ti-do");
    }
}
