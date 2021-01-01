package acme.study_guide.chapter08.review_questions.question23;

class Fox extends Canine {
    public Fox(long x) {
        print("p");
    }

    public Fox(String name) {
        this(2);
        print("z");
    }
}
