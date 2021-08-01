package acme.tests.chapter10.test28;

import java.util.ArrayList;
import java.util.List;

public class Ocean {
    private final List<String> algae;
    private final double wave;
    private int sun;

    public Ocean(double wave) {
        this.wave = wave;
        this.algae = new ArrayList<>();
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        sun = sun;
    }

    public double getWave() {
        return wave;
    }

    public List<String> getAlgae() {
        return new ArrayList<String>(algae);
    }
}
