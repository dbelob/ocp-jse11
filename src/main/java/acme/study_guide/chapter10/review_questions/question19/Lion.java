package acme.study_guide.chapter10.review_questions.question19;

class HasSoreThroatException extends Exception {
}

class TiredException extends RuntimeException {
}

interface Roar {
    void roar() throws HasSoreThroatException;
}

class Lion implements Roar {
    // A
    public void roar() {
    }

    // B
//    public int roar() throws RuntimeException {
//    }

    // C
//    public void roar() throws Exception {
//    }

    // D
//    public void roar() throws HasSoreThroatException {
//    }

    // E
//    public void roar() throws IllegalArgumentException {
//    }

    // F
//    public void roar() throws TiredException {
//    }
}
