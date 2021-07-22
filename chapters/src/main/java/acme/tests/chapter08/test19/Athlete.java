package acme.tests.chapter08.test19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Athlete {
    int stroke = 0;
    public synchronized void swimming() {
        stroke++;
    }
    private int getStroke() {
        synchronized(this) { return stroke; }
    }
    public static void main(String... laps) throws InterruptedException {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for(int i=0; i<1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.shutdown();
        s.awaitTermination(10, TimeUnit.SECONDS);
        System.out.print(a.getStroke());
    }
}
