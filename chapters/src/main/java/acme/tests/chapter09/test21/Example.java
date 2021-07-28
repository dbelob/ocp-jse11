package acme.tests.chapter09.test21;

import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    void order() throws Exception {
        var s = Path.of("/tea", "earlGrey", "hot");
        Files.find(s, 42, (p, a) -> a.isDirectory());
    }
}
