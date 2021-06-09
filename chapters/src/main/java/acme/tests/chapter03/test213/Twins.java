package acme.tests.chapter03.test213;

interface Alex {
    default void write() { System.out.print("1"); }
    static void publish() {}
    void think();
    private int process() { return 80; }
}
interface Michael {
    default void write() { System.out.print("2"); }
    static void publish() {}
    void think();
    private int study() { return 100; }
}
public class Twins implements Alex, Michael {
    public void write() { System.out.print("3"); }
    static void publish() {}
    public void think() {
        System.out.print("Thinking...");
    }
}
