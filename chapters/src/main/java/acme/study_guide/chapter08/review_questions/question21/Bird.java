package acme.study_guide.chapter08.review_questions.question21;

class Bird {
    int feathers = 0;

    Bird(int x) {
        this.feathers = x;
    }

    Bird fly() {
        return new Bird(1);
    }
}
