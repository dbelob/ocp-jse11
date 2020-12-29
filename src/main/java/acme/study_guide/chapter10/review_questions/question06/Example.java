package acme.study_guide.chapter10.review_questions.question06;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {
    public void tryAgain(String s) throws FileNotFoundException {
//        try (FileReader r = null,p=new FileReader("")){
        try (FileReader r = null; FileReader p = new FileReader("")) {
            System.out.print("X");
            throw new IllegalArgumentException();
//        } catch (Exception s) {
        } catch (Exception s2) {
            System.out.print("A");
            throw new FileNotFoundException();
        } finally {
            System.out.print("O");
        }
    }
}
