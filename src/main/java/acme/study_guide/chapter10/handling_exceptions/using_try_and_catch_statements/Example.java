package acme.study_guide.chapter10.handling_exceptions.using_try_and_catch_statements;

public class Example {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("get up");
    }

    void seeAnimals() {
        System.out.println("see animals");
    }

    public static void main(String[] args) {
        new Example().explore();
    }
}
