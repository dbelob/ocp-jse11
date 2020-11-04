package acme.study_guide.chapter04.review_questions.question08;

public class Example {
    public static void main(String[] args) {
        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
    }
}
