package acme.tests.chapter14.test30;

import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

class Mouse {
    String favoriteFood() {
        return "Roquefort";
    }
}

public class Example {
    public static void main(String... args) {
        String cheese = ServiceLoader.load(Mouse.class)
                .stream()
                .map(Provider::get)
                .map(Mouse::favoriteFood)
                .findFirst().orElse("");
    }
}
