package acme.tests.chapter14.test31;

abstract public class Exam {
    boolean pass;

    protected abstract boolean passed();

    class JavaProgrammerCert extends Exam {
        private Exam part1;
        private Exam part2;

//        public boolean passed() { return part1.passed() && part2.passed(); }
        public boolean passed() { return part1.pass && part2.pass; }
    }
}
