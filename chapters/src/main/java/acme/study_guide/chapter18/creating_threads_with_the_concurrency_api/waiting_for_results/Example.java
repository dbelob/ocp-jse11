package acme.study_guide.chapter18.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> future = service.submit(() -> System.out.println("Hello"));

            while (!future.isDone()) {
                System.out.println("Waiting...");
                Thread.sleep(1000);
            }

            System.out.println("Done");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
