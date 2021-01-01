package acme.study_guide.chapter08.review_questions.question26;

public class Orangutan extends Primate {
    protected int age = 4;

    {
        age = 5;
    }

    public Orangutan() {
//        this().age = 6;
        this.age = 6;
    }

    public static void main(String[] bananas) {
        final Primate x = (Primate) new Orangutan();
        System.out.println(x.age);
    }
}
