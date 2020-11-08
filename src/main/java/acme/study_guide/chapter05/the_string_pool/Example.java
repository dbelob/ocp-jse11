package acme.study_guide.chapter05.the_string_pool;

public class Example {
    public static void main(String[] args) {
        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);            // true
        System.out.println(first == second.intern());   // true
        System.out.println(first == third);             // false
        System.out.println(first == third.intern());    // true
    }
}
