package acme.tests.chapter13.test27;

@FunctionalInterface
interface Dog {
    default void drink() {
    }

    void play();
}
