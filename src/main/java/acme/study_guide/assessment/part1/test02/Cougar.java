package acme.study_guide.assessment.part1.test02;

interface HasTail {
    int getTailLength();
}

abstract class Puma implements HasTail {
    /* protected */
    public int getTailLength() {
        return 4;
    }
}

public class Cougar implements HasTail {
    public static void main(String[] args) {
//        var puma = new Puma();
//        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 2;
    }

    @Override
    public int getTailLength() {
        return 0;
    }
}
