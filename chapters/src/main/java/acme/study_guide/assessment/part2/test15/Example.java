package acme.study_guide.assessment.part2.test15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        var x = Path.of("/gorilla/signs.txt");
//        Files.find(x.getParent(), 10.0, // k1
        Files.find(x.getParent(), 10, // k1
//                (Path p) -> p.toString().endsWith(".txt")) // k2
                (Path p, BasicFileAttributes attrs) -> p.toString().endsWith(".txt")) // k2
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Files.readAllLines(x) // k3
        Files.lines(x) // k3
                .flatMap(p -> Stream.of(p.split(" "))) // k4
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);
    }
}
