package acme.tests.chapter15.test36;

import java.util.function.Supplier;

public class Ready {
    private static double getNumber() {
        return .007;
    }

    public static void main(String[] args) {
//        Supplier<double> s = Ready::getNumber;
        Supplier<Double> s = Ready::getNumber;
        double d = s.get();
        System.out.println(d);
    }
}
