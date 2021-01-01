package acme.study_guide.chapter07.applying_the_static_keyword.accessing_a_static_variable_or_method;

import acme.study_guide.chapter07.applying_the_static_keyword.Koala;

public class Example {
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count);          // k is a Koala
        k = null;
        System.out.println(k.count);          // k is still a Koala
    }
}
