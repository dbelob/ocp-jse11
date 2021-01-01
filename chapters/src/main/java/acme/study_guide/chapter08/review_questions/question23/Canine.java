package acme.study_guide.chapter08.review_questions.question23;

class Canine {
    public Canine(boolean t) {
        logger.append("a");
    }

    public Canine() {
        logger.append("q");
    }

    private StringBuilder logger = new StringBuilder();

    protected void print(String v) {
        logger.append(v);
    }

    protected String view() {
        return logger.toString();
    }
}
