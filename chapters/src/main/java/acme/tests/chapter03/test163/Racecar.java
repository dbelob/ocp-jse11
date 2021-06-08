package acme.tests.chapter03.test163;

final public class Racecar {
    final private int speed = 88;
    final protected class Engine {

        private final int speed = 100;
        public final int getSpeed() {
            return Racecar.this.speed;
        }
    }
    final Engine engine = new Engine();
    final public static void main(String[] feed) {
        System.out.print(new Racecar().engine.getSpeed());
    }
}
