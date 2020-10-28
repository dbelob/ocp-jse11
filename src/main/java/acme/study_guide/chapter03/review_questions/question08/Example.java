package acme.study_guide.chapter03.review_questions.question08;

public class Example {
    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++;
        long goat = (int) 2;
        goat -= 1.0;
        System.out.print(pig + " - " + goat);
    }
}
