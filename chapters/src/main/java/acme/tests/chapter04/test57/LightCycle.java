package acme.tests.chapter04.test57;

class DiskPlayer implements AutoCloseable {
    public void close() {
    }
}

public class LightCycle {
    public static void main(String... bits) {
        try (DiskPlayer john = new DiskPlayer()) {
            System.out.println("ping");
            john.close();
        } finally {
            System.out.println("pong");
//            john.close();
        }
        System.out.println("return");
    }
}
