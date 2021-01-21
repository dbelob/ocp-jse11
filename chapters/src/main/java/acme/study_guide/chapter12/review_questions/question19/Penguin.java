package acme.study_guide.chapter12.review_questions.question19;

interface Swim {
    default void perform() {
        System.out.print("Swim!");
    }
}

interface Dance {
    default void perform() {
        System.out.print("Dance!");
    }
}

public class Penguin implements Swim, Dance {
    public void perform() {
        System.out.print("Smile!");
    }

    private void doShow() {
//        Swim.perform();
        Swim.super.perform();
    }

    public static void main(String[] eggs) {
        new Penguin().doShow();
    }
}
