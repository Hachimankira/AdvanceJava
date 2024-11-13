import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        // Creating a ThreadPoolExecutor with a fixed pool size of 2
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        // Submit tasks to the executor
        for (int i = 0; i < 500; i++) {
            executor.submit(new Task("Task " + i));
        }

        // Shut down the executor
        executor.shutdown();

        try {
            // Wait for all tasks to complete before continuing
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + name);
        try {
            Thread.sleep(2000); // Simulate task taking time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
