package acme.tests.chapter09.test34;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exterminate {
    public void deleteTree(Path q) throws IOException {
        if (!Files.isDirectory(q))
            Files.delete(q);
        else {
//            Files.list(q).forEach(this::deleteTree);
            Files.delete(q);
        } }
}
