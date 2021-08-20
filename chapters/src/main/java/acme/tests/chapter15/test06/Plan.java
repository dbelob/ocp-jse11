package acme.tests.chapter15.test06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Plan {
//    ExecutorService s = Executors.newScheduledThreadPool(10);
    ScheduledExecutorService s = Executors.newScheduledThreadPool(10);

    public void planEvents() {
        Runnable r1 = () -> System.out.print("Check food");
        Runnable r2 = () -> System.out.print("Check drinks");
        Runnable r3 = () -> System.out.print("Take out trash");
//        s.scheduleWithFixedDelay(r1, 1, TimeUnit.HOURS);      // g1
        s.scheduleWithFixedDelay(r1, 1, 1, TimeUnit.HOURS);      // g1
        s.scheduleAtFixedRate(r2, 1, 1000, TimeUnit.SECONDS);  // g2
        s.execute(r3);                                      // g3
        s.shutdownNow();
    }
}
