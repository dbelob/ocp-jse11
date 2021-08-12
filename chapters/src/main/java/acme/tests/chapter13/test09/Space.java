package acme.tests.chapter13.test09;

import java.util.ArrayList;
import java.util.List;

public class Space {
    // m2
    final void frontier() {
        List<Object> stars = List.of(1, 2, 3);
        stars.add(4);

        // m3
        List planets = new ArrayList<>();
        planets.add(5);
    }

    public static void main(String... args) {
    }
}
