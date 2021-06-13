package acme.tests.chapter04.test27;

public class Example {
    static class Resource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("close");
        }
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("1");

            throw new Exception();
        } catch (Exception e) {
            System.out.println("2");
        }
    }
}
