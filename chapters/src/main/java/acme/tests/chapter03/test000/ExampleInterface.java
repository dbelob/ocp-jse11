package acme.tests.chapter03.test000;

public interface ExampleInterface {
    // Default
    default void default0() {
    }

    public default void default1() {
    }

//    protected default void default2() {
//    }

//    private default void default3() {
//    }

    // Static
    static void static0() {
    }

    public static void static1() {
    }

//    protected static void static2() {
//    }

    // since Java 9
    private static void static3() {
    }

    // Abstract
    void abstract0();

    public void abstract1();

//    protected void abstract2();

//    private void abstract3();

    // Standard
//    void standard0() {}

//    public void standard1() {}

//    protected void standard2() {}

    // since Java 9
    private void standard3() {}
}
