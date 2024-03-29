package acme.tests.chapter14.test20;

public class Shoot {
    interface Target {
        boolean needToAim(double angle);
    }

    static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle);  // k1
        System.out.println(ready);
    }

    public static void main(String[] args) {
//        prepare(45, d => d> 5 || d < -5);   // k2
        prepare(45, d -> d > 5 || d < -5);   // k2
    }
}
