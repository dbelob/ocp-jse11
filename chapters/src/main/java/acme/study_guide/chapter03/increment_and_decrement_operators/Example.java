package acme.study_guide.chapter03.increment_and_decrement_operators;

public class Example {
    public static void main(String[] args) {
        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);
        System.out.println("tiger is " + tiger);
    }
}
