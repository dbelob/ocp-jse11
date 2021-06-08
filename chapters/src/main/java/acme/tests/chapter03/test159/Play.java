package acme.tests.chapter03.test159;

//@FunctionalInterface
public interface Play {
    public static void baseball() {}
    private static void soccer() {}
    default void play() {}
    void fun();
    void game();
    void toy();
}
