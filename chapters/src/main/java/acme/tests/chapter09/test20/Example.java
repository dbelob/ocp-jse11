package acme.tests.chapter09.test20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    private void jumpAround(InputStream is) throws IOException {
        try (is) {
            is.skip(1);
            is.read();
            is.skip(1);
            is.mark(4);
            is.skip(1);
            is.reset();
            System.out.print(is.read());
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[]{2, 3, 5, 7});

        new Example().jumpAround(is);
    }
}
