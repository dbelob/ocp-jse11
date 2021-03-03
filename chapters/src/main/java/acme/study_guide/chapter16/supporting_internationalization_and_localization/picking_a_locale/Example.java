package acme.study_guide.chapter16.supporting_internationalization_and_localization.picking_a_locale;

import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }
}
