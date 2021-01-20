package acme.study_guide.chapter12.review_questions.question09;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }

    protected /* final */ class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }

    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {
        };
        //...
    }
}
