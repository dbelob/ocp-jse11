package acme.tests.chapter13.test27;

@FunctionalInterface
interface Webby extends Dog {
    abstract void play();
    default void rest() {}
    abstract String toString();
}
