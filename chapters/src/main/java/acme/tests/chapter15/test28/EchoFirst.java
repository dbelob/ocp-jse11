package acme.tests.chapter15.test28;

import java.util.Arrays;

public class EchoFirst {
    private static void internalMain(String[] args) {
        Arrays.sort(args);
        var result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }

    public static void main(String[] args) {
        internalMain(new String[]{"seed", "flower", "plant"});
    }
}
