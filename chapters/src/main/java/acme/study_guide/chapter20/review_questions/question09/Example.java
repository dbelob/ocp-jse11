package acme.study_guide.chapter20.review_questions.question09;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        var path1 = Path.of("/pets/../cat.txt");
        var path2 = Paths.get("./dog.txt");

        System.out.println(path1.resolve(path2));   // /pets/../cat.txt/./dog.txt
        System.out.println(path2.resolve(path1));   // /pets/../cat.txt
    }
}
