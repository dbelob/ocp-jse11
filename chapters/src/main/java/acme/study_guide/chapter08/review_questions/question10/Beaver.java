package acme.study_guide.chapter08.review_questions.question10;

class Beaver extends Rodent {
    public Beaver(int x) {
        super(x);
    }

    public static /* Number */ Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}
