package acme.study_guide.chapter07.applying_the_static_keyword.static_imports;

import java.util.Arrays;
//static import java.util.Arrays.*;     // DOES NOT COMPILE
//import static java.util.Arrays;       // DOES NOT COMPILE

public class BadStaticImports {
    public static void main(String[] args) {
        Arrays.asList("one");           // DOES NOT COMPILE
    }
}
