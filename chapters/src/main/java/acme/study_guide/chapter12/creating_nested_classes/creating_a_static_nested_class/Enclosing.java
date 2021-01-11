package acme.study_guide.chapter12.creating_nested_classes.creating_a_static_nested_class;

public class Enclosing {
    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
