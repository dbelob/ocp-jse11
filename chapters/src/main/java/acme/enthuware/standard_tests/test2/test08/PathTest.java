package acme.enthuware.standard_tests.test2.test08;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getRoot(){
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}
