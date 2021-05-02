package acme.study_guide.chapter20.review_questions.question02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    public void removeBadFile(Path path) throws IOException {
        if (Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path)
                    ? "Success" : "Try Again");
    }
}
