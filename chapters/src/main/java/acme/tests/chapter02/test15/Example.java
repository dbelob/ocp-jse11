package acme.tests.chapter02.test15;

public class Example {
    public void magic() {
        do {
            int trick = 0;
            LOOP:
            do {
                trick++;
            } while (trick < /* 2-- */ 0);
//            continue LOOP;
        } while (1 > 2);
//        System.out.println(trick);
    }
}
