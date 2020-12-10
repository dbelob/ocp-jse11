package acme.study_guide.chapter08.review_questions.question21;

class Parrot extends Bird {
    protected Parrot(int y) {
        super(y);
    }

    protected Parrot fly() {
        return new Parrot(2);
    }
}
