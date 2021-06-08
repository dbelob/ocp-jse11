package acme.tests.chapter03.test184;

public class Husky {
    { this.food = 10; }
    { this.toy = 2; }

    private /* final */ int toy;
    private static int food;
    public Husky(int friend) {
        this.food += friend++;
        this.toy -= friend--;
    }
    public static void main(String... unused) {
        var h = new Husky(2);
        System.out.println(h.food+","+h.toy);
    }
}
