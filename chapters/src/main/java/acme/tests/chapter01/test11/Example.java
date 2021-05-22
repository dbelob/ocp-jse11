package acme.tests.chapter01.test11;

public class Example {
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }
}
