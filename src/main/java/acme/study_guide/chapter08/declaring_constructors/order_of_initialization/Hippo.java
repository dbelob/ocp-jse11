package acme.study_guide.chapter08.declaring_constructors.order_of_initialization;

public class Hippo extends Animal {
    static {
        System.out.print("B");
    }

    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}
