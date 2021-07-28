package acme.tests.chapter09.test27;

import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    void brew() throws Exception {
        final var m = Path.of("coffee");
        Files.walk(m)
                .filter(Files::isDirectory)
                .forEach(Files::isDirectory);
    }

    public static void main(String[] args) throws Exception {
        new Example().brew();
    }
}
