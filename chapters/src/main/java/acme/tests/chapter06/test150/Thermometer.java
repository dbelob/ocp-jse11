package acme.tests.chapter06.test150;

import java.util.List;
import java.util.stream.Collectors;

public class Thermometer {
    private String feelsLike;
    private double temp;

    public Thermometer(String feelsLike, double temp) {
        this.feelsLike = feelsLike;
        this.temp = temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return feelsLike;
    }

    public static void main(String... season) {
        var readings = List.of(new Thermometer("HOT!", 72),
                new Thermometer("Too Cold!", 0),
                new Thermometer("Just right!", 72));
        readings
                .parallelStream()               // k1
                .collect(Collectors.groupingByConcurrent(
                        Thermometer::getTemp))       // k2
                .forEach((k, v) -> System.out.println(String.format("%s, %s", k, v)));  // k3
    }
}
