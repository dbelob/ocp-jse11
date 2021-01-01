package acme.study_guide.chapter07.review_questions.question10.rope;

public class Rope {
    public static int LENGTH = 5;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }
}
