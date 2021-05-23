package acme.tests.chapter01.test25;

public class Example {
    public static void main(String[] args) {
        int height = 2, length = 3;

        // height = 2, length = 3

        boolean w = height > 1 | --length < 4;

        // height = 2, length = 2, w = (2 > 1) | (2 < 4) = true

        var x = height != 2 ? length++ : height;

        // height = 2, length = 2, w = true, x = 2

        boolean z = height % length == 0;

        // height = 2, length = 2, w = true, x = 2, z = true

        System.out.println(w + "-" + x + "-" + z);

        // true-2-true
    }
}
