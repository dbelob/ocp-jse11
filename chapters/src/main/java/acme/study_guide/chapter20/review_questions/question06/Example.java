package acme.study_guide.chapter20.review_questions.question06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/animals");
//        try (var z = Files.walk(path)) {
//            boolean b = z
//                    .filter((p, a) -> a.isDirectory() && !path.equals(p)) // x
//                    .findFirst().isPresent();  // y

        try (var z = Files.find(path, 10,
                (p, a) -> a.isDirectory() && !path.equals(p))) {
            boolean b = z
//                    .filter((p, a) -> a.isDirectory() && !path.equals(p)) // x
                    .findFirst().isPresent();  // y

            System.out.print(b ? "No Sub" : "Has Sub");
        }
    }
}
