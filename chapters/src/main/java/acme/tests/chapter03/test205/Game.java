package acme.tests.chapter03.test205;

interface Sport {
    private int play() {
        return 15;
    }
}

interface Tennis extends Sport {
    private int play() {
        return 30;
    }
}

public class Game implements Tennis {
    public int play() {
        return 15;
    }

    public static void main(String... ace) {
        System.out.println(new Game().play());
    }
}
