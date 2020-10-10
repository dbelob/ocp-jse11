package acme.study_guide.assessment.part2.test02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {
        // Current directory is /bats/day
        var path1 = Path.of("/bats/night", "..")
                .resolve(Paths.get("./sleep.txt")).normalize();
        var path2 = new File("../sleep.txt").toPath().toRealPath();
        System.out.print(Files.isSameFile(path1, path2));
        System.out.print(" " + path1.equals(path2));
    }
}
