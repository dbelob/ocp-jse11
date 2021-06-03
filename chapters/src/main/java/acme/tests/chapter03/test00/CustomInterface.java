package acme.tests.chapter03.test00;

public interface CustomInterface {
    abstract void abstractMethod();

    default void defaultMethod() {
        abstractMethod();
    }
}
