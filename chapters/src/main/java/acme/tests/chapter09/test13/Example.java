package acme.tests.chapter09.test13;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Example {
    public static void main(String[] args) throws URISyntaxException, IOException {
        var path = Paths.get(new URI("ice.cool"));
//        var view = Files.readAttributes(path,
//                BasicFileAttributes.class);
        var view = Files.getFileAttributeView(path,
                BasicFileAttributeView.class);
//        Files.createDirectories(Path.relativize(".backup"));
        Files.createDirectories(path.relativize(Paths.get(".backup")));
//        if (view.length() > 0 && view.isDirectory())
//            view.setTimes(null, null, null);

        BasicFileAttributes fileAttributes = view.readAttributes();

        if (fileAttributes.size() > 0 && fileAttributes.isDirectory())
            view.setTimes(null, null, null);
        System.out.println(Files.deleteIfExists(path));
    }
}
