import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Create a CompletableFuture that runs a task asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a long-running task
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello, World!";
        });

        // Chain another task to process the result
        CompletableFuture<String> processedFuture = future.thenApply(result -> {
            return result.toUpperCase();
        });

        // Handle the final result or exception
        processedFuture.thenAccept(result -> {
            System.out.println("Processed Result: " + result);
        }).exceptionally(ex -> {
            System.err.println("Something went wrong: " + ex.getMessage());
            return null;
        });

        // Wait for the future to complete
        try {
            processedFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}