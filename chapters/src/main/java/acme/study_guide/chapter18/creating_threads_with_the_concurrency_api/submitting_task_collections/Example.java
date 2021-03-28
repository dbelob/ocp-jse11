package acme.study_guide.chapter18.creating_threads_with_the_concurrency_api.submitting_task_collections;

import java.util.List;
import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");

            Callable<String> task = () -> "result";
            List<Future<String>> list = service.invokeAll(
                    List.of(task, task, task));

            for (Future<String> future : list) {
                System.out.println(future.get());
            }

            System.out.println("end");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
