package acme.study_guide.chapter08.review_questions.question23;

public class Fennec extends Fox {
    public Fennec(int e) {
        super("tails");
        print("j");
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String... unused) {

        System.out.println(new Fennec(1).view());
    }
}
