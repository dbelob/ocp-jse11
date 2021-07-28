package acme.tests.chapter09.test40;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TheCount {
    public static Stream<String> readLines(Path p) {
        try {
            return Files.lines(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long count(Path p) throws Exception {
        return Files.list(p)
                .filter(w -> Files.isRegularFile(w))
                .flatMap(s -> readLines(s))
                .count();
    }

    public static void main(String[] d) throws Exception {
        System.out.print(count(Paths.get("/all-data")));
    }
}
