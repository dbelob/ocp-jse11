package acme.enthuware.standard_tests.starter_test.test07;

import java.nio.file.Path;
import java.nio.file.Paths;

// What will the following code fragment print?
public class Example {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = Paths.get("c:\\personal\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }
}
// A. ..\..\..\..\index.html
// B. ..\..\..\index.html
// C. ..\index.html
// D. c:\personal\index.html
