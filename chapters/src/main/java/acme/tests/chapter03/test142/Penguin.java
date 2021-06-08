package acme.tests.chapter03.test142;

public class Penguin {
    private int volume = 1;
    private class Chick {
        private final static int volume = 3;
        void chick() {
            System.out.print("Honk("+Penguin.this.volume+")!");
        }
    }
    public static void main(String... eggs) {
        Penguin pen = new Penguin();
        final Penguin.Chick littleOne = pen.new Chick();
        littleOne.chick();
    }
}
