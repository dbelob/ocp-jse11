package acme.study_guide.chapter09.review_questions.question07;

abstract class Nocturnal {
//    boolean isBlind();
    abstract boolean isBlind();
//    boolean isBlind() {
//        return true;
//    }
}

public class Owl extends Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        var nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
