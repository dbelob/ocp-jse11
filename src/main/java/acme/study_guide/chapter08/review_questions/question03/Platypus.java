package acme.study_guide.chapter08.review_questions.question03;

public class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }

    public Platypus() {
//        System.out.print("Platypus");
        super(42);
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
