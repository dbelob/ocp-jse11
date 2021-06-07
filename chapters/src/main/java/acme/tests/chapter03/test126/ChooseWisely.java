package acme.tests.chapter03.test126;

public class ChooseWisely {
    public ChooseWisely() {
        super();
    }

    public int choose(int choice) {
        return 5;
    }

    public int choose(short choice) {
        return 2;
    }

    public int choose(long choice) {
        return 11;
    }

    public int choose(double choice) {
        return 6;
    }

    public int choose(Float choice) {
        return 8;
    }

    public static void main(String[] path) {
        ChooseWisely c = new ChooseWisely();
        System.out.println(c.choose(2f));
        System.out.println(c.choose((byte) 2 + 1));
    }
}
