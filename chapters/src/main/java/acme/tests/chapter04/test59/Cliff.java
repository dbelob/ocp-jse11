package acme.tests.chapter04.test59;

final class FallenException extends Exception {}

final class HikingGear implements AutoCloseable {
    @Override public void close() throws Exception {
        throw new FallenException();
    }
}

public class Cliff {
    public final void climb() throws Exception {
        try (HikingGear gear = new HikingGear()) {
            throw new RuntimeException();
        }
    }
    public static void main(String... rocks) {
        try {
            new Cliff().climb();
        } catch (Throwable t) {
            System.out.println(t);  // e1

            for (Throwable t2: t.getSuppressed())
                System.out.println("Suppressed: " + t2.getMessage());
        }
    }
}
