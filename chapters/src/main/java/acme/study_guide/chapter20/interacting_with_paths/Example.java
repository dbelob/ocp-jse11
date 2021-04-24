package acme.study_guide.chapter20.interacting_with_paths;

import java.nio.file.Path;

public class Example {
    public static void main(String[] args) {
        Path p = Path.of("/zoo/../home").getParent().normalize().toAbsolutePath();

        System.out.println(p);
    }
}
