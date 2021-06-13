package acme.tests.chapter04.test06;

import java.io.InputStream;

public class Example {
    static class Scanner implements AutoCloseable {
        public Scanner(InputStream is) {
        }

        @Override
        public void close() throws Exception {
        }

        void nextLine() {
        }
    }

    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print(1);
            s.nextLine();
            System.out.print(2);
//            s = null;
        } catch (IllegalArgumentException | NullPointerException x) {
//            s.nextLine();
            System.out.print(3);
        } finally {
//            s.nextLine();
            System.out.print(4);
        }
        System.out.print(5);
    }
}
