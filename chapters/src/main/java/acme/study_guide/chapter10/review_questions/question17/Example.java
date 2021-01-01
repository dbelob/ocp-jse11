package acme.study_guide.chapter10.review_questions.question17;

public class Example {
    void rollOut() throws ClassCastException {
    }

    public void transform(String c) {
        try {
            rollOut();
//        } catch (IllegalArgumentException | Error b) {
        } catch (IllegalArgumentException | ClassCastException f) {
        }
    }
}
