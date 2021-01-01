package acme.study_guide.chapter05.review_questions.question10;

public class Example {
    public static void main(String[] args) {
        var letters = new StringBuilder("abcdefg");

        System.out.printf("Result: %s\n", letters.substring(6, 7));
        System.out.printf("Result: %s\n", letters.substring(7, 8));
    }
}
