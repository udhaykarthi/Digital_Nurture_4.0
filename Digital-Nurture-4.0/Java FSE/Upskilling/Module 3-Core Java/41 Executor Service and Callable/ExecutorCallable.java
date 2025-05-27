import java.util.*;
import java.util.concurrent.*;
class ExecutorCallable {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list of Callable tasks
        List<Callable<String>> taskList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            taskList.add(() -> {
                Thread.sleep(1000); // Simulate time-consuming task
                return "Result from Task " + taskId;
            });
        }

        try {
            // Submit tasks to executor and collect Futures
            List<Future<String>> results = executor.invokeAll(taskList);

            // Retrieve results
            for (Future<String> future : results) {
                try {
                    System.out.println("✅ " + future.get());
                } catch (ExecutionException | InterruptedException e) {
                    System.out.println("❌ Error retrieving result");
                    e.printStackTrace();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Always shutdown the executor
        }
    }
}
