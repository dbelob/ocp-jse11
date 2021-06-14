package acme.tests.chapter04.test52;

class Chair {
    public void sit() throws IllegalArgumentException {
        System.out.print("creek");
        throw new RuntimeException();
    }
}

public class Stool extends Chair {
    public void sit() throws RuntimeException {
        System.out.print("thud");
    }

    public static void main(String... c) throws Exception {
        try {
            new Stool().sit();
        } finally {
            System.out.print("?");
        }
    }

}
