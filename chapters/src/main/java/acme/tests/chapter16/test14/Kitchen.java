package acme.tests.chapter16.test14;

public class Kitchen {
    class Mixer {
        class Spinner {
        }
    }

    public void bake() {
        var a = new Kitchen().new Mixer().new Spinner();                    // A
        var d = new Mixer().new Spinner();                                  // D
        Kitchen.Mixer.Spinner e = new Kitchen().new Mixer().new Spinner();  // E
//        Spinner f = new Kitchen().new Mixer().new Spinner();                // F
    }
}
