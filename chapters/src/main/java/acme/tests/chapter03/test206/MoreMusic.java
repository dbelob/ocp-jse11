package acme.tests.chapter03.test206;

public class MoreMusic {
    {
        System.out.print("do-");
        System.out.print("re-");
    }

    public MoreMusic() {
        System.out.print("mi-");
    }

    public MoreMusic(int note) {
//        this(null);
        System.out.print("fa-");
    }

    public MoreMusic(String song) {
        this(9);
        System.out.print("so-");
    }

    public static void main(String[] sound) {
        System.out.print("la-");
        var play = new MoreMusic(1);
    }
}
