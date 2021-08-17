package acme.tests.chapter14.test33;

interface MakesNoise {
}

abstract class Instrument implements MakesNoise {
    public Instrument(int beats) {
    }

    public void play() {
    }
}

public class Drum extends Instrument {
    public Drum() {
        super(42);
    }

    public void play(int count) {
    }

    public void concert() {
//        super.play(5);
    }

    public static void main(String[] beats) {
        MakesNoise mn = new Drum();
//        mn.concert();
    }
}
