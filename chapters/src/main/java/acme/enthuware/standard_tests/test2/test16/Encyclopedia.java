package acme.enthuware.standard_tests.test2.test16;

public interface Encyclopedia extends Book {
    String getId0();

    default String getId1() {
        return "AIN8888";
    }
}
