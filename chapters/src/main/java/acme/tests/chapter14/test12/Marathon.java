package acme.tests.chapter14.test12;

import java.util.Optional;
import java.util.stream.Stream;

class Runner {
    private int numberMinutes;

    public Runner(int n) {
        numberMinutes = n;
    }

    public int getNumberMinutes() {
        return numberMinutes;
    }
}

public class Marathon {
    public static void main(String[] args) {
        var match = Optional.ofNullable(161);    // line z

        var runners = Stream.of(new Runner(183),
                new Runner(161), new Runner(201));
        var opt = runners.map(Runner::getNumberMinutes)
                .filter(m -> match.get().equals(m))
                .peek(System.out::println)
                .count();
    }
}
