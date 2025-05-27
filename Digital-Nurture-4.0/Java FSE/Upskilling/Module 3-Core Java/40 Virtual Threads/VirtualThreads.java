import java.time.Duration;
import java.time.Instant;

public class VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100_000;

        System.out.println("🔄 Starting virtual threads...");
        Instant startVirtual = Instant.now();

        Thread[] vThreads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            int id = i;
            vThreads[i] = Thread.startVirtualThread(() -> {
                System.out.println("👻 Virtual Thread: " + id);
            });
        }

        for (Thread t : vThreads) {
            t.join(); 
        }

        Instant endVirtual = Instant.now();
        System.out.println("✅ Virtual threads completed in: " + Duration.between(startVirtual, endVirtual).toMillis() + " ms");
    }    
}    