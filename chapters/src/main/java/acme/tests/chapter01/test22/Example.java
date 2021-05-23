package acme.tests.chapter01.test22;

public class Example {
    public static void main(String[] args) {
        int time = 9;
        int day = 3;
        var dinner = ++time >= 10 ? day-- <= 2
                ? "Takeout" : "Salad" : "Leftovers";
//        var dinner = (++time >= 10) ?
//        ((day-- <= 2) ? "Takeout" : "Salad") :
//        "Leftovers";
        System.out.println(dinner);
    }
}
