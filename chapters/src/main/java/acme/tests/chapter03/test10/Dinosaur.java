package acme.tests.chapter03.test10;

public class Dinosaur {
    class Pterodactyl extends Dinosaur {}
    public void roar() {
        var dino = new Dinosaur();

        dino.new Pterodactyl();     // C
        new Dinosaur.Pterodactyl(); // F
    }
}
