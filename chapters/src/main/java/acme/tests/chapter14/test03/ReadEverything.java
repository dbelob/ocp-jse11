package acme.tests.chapter14.test03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEverything {
    public void readFile(Path p) {
        try {
            Files.readAllLines(p)
//                    .parallel()
                    .parallelStream()
                    .forEach(System.out::println);
        } catch (Exception e) {
        }
    }

    public void read(Path directory) throws Exception {
        Files.walk(directory)
//                .filter(p -> File.isRegularFile(p))
                .filter(p -> Files.isRegularFile(p))
                .forEach(x -> readFile(x));
    }

    public static void main(String[] b) throws /* IOException */ Exception {
//        Path p = Path.get("collection");
//        Path p = Path.of("collection");
        Path p = Paths.get("collection");
        new ReadEverything().read(p);
    }
}
