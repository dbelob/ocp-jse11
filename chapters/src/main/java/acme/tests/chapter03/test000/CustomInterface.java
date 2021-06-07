package acme.tests.chapter03.test000;

public interface CustomInterface {
    abstract void abstractMethod();

    default void defaultMethod() {
        abstractMethod();
    }
}
