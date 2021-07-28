package acme.tests.chapter09.test23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sneaker {
    public void setupInventory(Path d) throws Exception {
        Path suggestedPath = Paths.get("sneakers");
        if (Files.isSameFile(suggestedPath, d)           // j1
                && !Files.exists(suggestedPath))
            Files.createDirectories(d);                  // j2
    }

    public static void main(String[] socks) throws Exception {
        Path w = new File("/stock/sneakers").toPath();  // j3
        new Sneaker().setupInventory(w);
    }
}
