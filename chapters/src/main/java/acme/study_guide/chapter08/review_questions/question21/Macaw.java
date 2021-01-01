package acme.study_guide.chapter08.review_questions.question21;

public class Macaw extends Parrot {
    public Macaw(int z) {
        super(z);
    }

    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        System.out.print(((Parrot) p.fly()).feathers);
    }
}
