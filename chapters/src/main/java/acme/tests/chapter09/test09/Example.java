package acme.tests.chapter09.test09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) throws IOException {
        var p = Path.of("breakfast.menu");
        Files.readAllLines(p).stream()
                .filter(s -> s.contains("eggs"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
