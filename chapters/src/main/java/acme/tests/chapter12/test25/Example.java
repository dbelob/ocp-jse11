package acme.tests.chapter12.test25;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

public class Example {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale.setDefault(Category.FORMAT, Locale.GERMANY);
        Locale.setDefault(Category.DISPLAY, Locale.UK);
        System.out.print(NumberFormat.getCurrencyInstance()
                .format(6.95));
    }
}
