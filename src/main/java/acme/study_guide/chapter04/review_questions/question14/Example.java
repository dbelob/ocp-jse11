package acme.study_guide.chapter04.review_questions.question14;

public class Example {
    public static void main(String[] args) {
        double iguana = 0;
        int snake = 1;
        do {
//            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.println(iguana);
    }
}
