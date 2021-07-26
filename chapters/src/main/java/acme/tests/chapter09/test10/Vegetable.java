package acme.tests.chapter09.test10;

import java.io.*;

public class Vegetable implements Serializable {
    private Integer size = 1;
    private transient String name = "Red";
    { size = 3; name = "Purple"; }
    public Vegetable() { this.size = 2; name = "Green"; }
    public static void main(String[] love) throws Throwable {
        try (var o = new ObjectOutputStream(
                new FileOutputStream("healthy.txt"))) {
            final var v = new Vegetable();
            v.size = 4;
            o.writeObject(v);
        }

        try (var o = new ObjectInputStream(
                new FileInputStream("healthy.txt"))) {
            var v = (Vegetable) o.readObject();
            System.out.print(v.size + "," + v.name);
        } }
}
