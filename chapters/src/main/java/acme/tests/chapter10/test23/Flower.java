package acme.tests.chapter10.test23;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private final String name;
    private final List<Integer> counts;

    public Flower(String name, List<Integer> counts) {
        this.name = name;
        this.counts = new ArrayList<>(counts);
    }

    public final String getName() {
        return name;
    }

    public final List<Integer> getCounts() {
        return new ArrayList<>(counts);
    }
}

class Plant {
    private final String name;
    private final List<Integer> counts;

    public Plant(String name, List<Integer> counts) {
        this.name = name;
        this.counts = new ArrayList<>(counts);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getCounts() {
        return new ArrayList<>(counts);
    }
}
