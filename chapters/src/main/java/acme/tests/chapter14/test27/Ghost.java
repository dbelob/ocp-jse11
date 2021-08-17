package acme.tests.chapter14.test27;

public class Ghost {
    private final String name;

    public Ghost() {
//        this(null);

        this.name = "Casper";
    }

    public Ghost(String n) {
        name = "Boo";
    }

    public static void main(String[] sound) {
        var d = new Ghost("Space");
        System.out.println(d.name);
    }
}
