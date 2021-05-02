package acme.study_guide.chapter20.review_questions.question01;

import java.nio.file.Path;

public class Example {
    public static void main(String[] args) {
        var path = Path.of("/user/./root", "../kodiacbear.txt");
//        path.normalize().relativize("/lion");
        var path2 = path.normalize().relativize(Path.of("/lion"));
        System.out.println(path);
        System.out.println(path2);
    }
}
