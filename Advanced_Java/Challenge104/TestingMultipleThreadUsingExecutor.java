package Challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThreadUsingExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            ThreadName t1 = new ThreadName();
            service.submit(t1); 
        }
   
        if(!service.awaitTermination(4, TimeUnit.SECONDS)){
            System.out.println("\n!!!! EMERGENCY SHUTDOWN !!!!!");
            service.shutdownNow();
        }
    }
}
