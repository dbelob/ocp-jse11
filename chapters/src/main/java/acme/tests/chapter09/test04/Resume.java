package acme.tests.chapter09.test04;

import java.nio.file.Files;
import java.nio.file.Path;

public class Resume {
    public void writeResume() throws Exception {
        var f1 = Path.of("/templates/proofs");
        Files.createDirectories(f1);
        var f2 = Path.of("/templates");
        Files.createDirectory(f2); // k1
        try (var w = Files.newBufferedWriter(
                Path.of(f2.toString(), "draft.txt"))) {
            w.append("My dream job");
            w.flush();
        }
        Files.delete(f1);
        Files.delete(f2);        // k2
    }

    public static void main(String... leads) {
        try {
            new Resume().writeResume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

