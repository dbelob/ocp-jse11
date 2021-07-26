package acme.tests.chapter09.test01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example {
    public static void main(String[] args) throws IOException {
        var oldHardDrivePath = Paths.get("c://rodent/mouse.txt");
        var newHardDrivePath = Paths.get("d://rodent/rat.txt");
        Files.move(oldHardDrivePath, newHardDrivePath,
                StandardCopyOption.REPLACE_EXISTING);
    }
}
