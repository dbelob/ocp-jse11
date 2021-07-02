package acme.tests.chapter06.test100;

import java.util.function.DoubleToIntFunction;

public class Bank {
    private int savingsInCents;

    private static class ConvertToCents {
        static DoubleToIntFunction f = p -> (int) (p * 100);
    }

    public static void main(String... currency) {
        Bank creditUnion = new Bank();
        creditUnion.savingsInCents = 100;
        double deposit = 1.5;

        creditUnion.savingsInCents +=
                ConvertToCents.f.applyAsInt(deposit);  // j1
        System.out.print(creditUnion.savingsInCents);
    }
}
