package acme.tests.chapter03.test000;

public class CustomClass implements CustomInterface {
    @Override
    public void abstractMethod() {
        System.out.println("anything");
    }

    public static void main(String[] args) {
        new CustomClass().defaultMethod();
    }
}
