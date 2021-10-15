package acme.enthuware.standard_tests.test2.test16;

interface Book {
    public default String getId0() {
        return "ISBN123456";
    }

    public default String getId1() {
        return "ISBN123456";
    }
}
