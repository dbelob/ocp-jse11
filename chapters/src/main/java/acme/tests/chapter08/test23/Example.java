package acme.tests.chapter08.test23;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService t = Executors
                .newSingleThreadScheduledExecutor();
        /* Future result = */ t.execute(System.out::println);
        t.invokeAll(null);
        t.scheduleAtFixedRate(() -> {
            return;
        }, 5, 5, TimeUnit.MINUTES);
    }
}
