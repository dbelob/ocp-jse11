package acme.tests.chapter14.test29;

public class Helicopter {
    public int adjustPropellers(int length, String[] type) {
        length++;
        type[0] = "LONG";
        return length;
    }

    public static void main(String[] climb) {
        final var h = new Helicopter();
        var length = 5;
        var type = new String[1];
        length = h.adjustPropellers(length, type);
        System.out.print(length + "," + type[0]);
    }
}
