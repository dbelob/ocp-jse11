package acme.tests.chapter02.test02;

public class Example {
    public static void main(String[] args) {
        var gas = true;
        do {
            System.out.println("helium");
            gas = gas ^ gas;
            gas = !gas;
        } while (!gas);
    }
}
