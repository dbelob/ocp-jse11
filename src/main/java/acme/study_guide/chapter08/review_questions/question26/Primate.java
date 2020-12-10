package acme.study_guide.chapter08.review_questions.question26;

class Primate {
    protected int age = 2;

    {
        age = 1;
    }

    public Primate() {
//        this().age = 3;
        this.age = 3;
    }
}
