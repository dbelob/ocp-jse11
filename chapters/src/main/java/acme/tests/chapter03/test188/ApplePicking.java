package acme.tests.chapter03.test188;

interface Tasty {
    default void eat() {
        System.out.print("Spoiled!");
    }
}

public class ApplePicking {
    public static void main(String[] food) {
        var apple = new Tasty() {
            @Override
            public void eat() {
                System.out.print("Yummy!");
            }
        };
    }
}
