package acme.study_guide.assessment.part1.test16.other;

import acme.study_guide.assessment.part1.test16.animal.Frog;

public class Tadpole extends Frog {
    public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit();
//        t.jump();
        Frog f = new Tadpole();
//        f.ribbit();
//        f.jump();
    }
}
