package acme.tests.chapter03.test144;

interface Fruit {
    public default char getColor() { return 'F'; }
}
interface Edible  {
    public default char getColor() { return 'E'; }
}
public class Banana implements Fruit, Edible {
    public char getColor() { return Edible.super.getColor(); }
    public static void main(String[] a) {
        var d = new Banana();
        System.out.println(d.getColor());
    }
}
