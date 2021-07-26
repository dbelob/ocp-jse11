package acme.tests.chapter09.test03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String fn = "icecream.txt";
        try (var w = new BufferedWriter(new FileWriter(fn));
             var s = System.out) {
            w.write("ALERT!");
            w.flush();
            w.write('!');
            System.out.print("1");
        } catch (IOException e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
    }
}
