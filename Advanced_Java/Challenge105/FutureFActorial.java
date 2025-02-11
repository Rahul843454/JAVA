package Challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureFActorial {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            PrintFactorial task = new PrintFactorial(i);
            list.add(service.submit(task));
        }

        try {
            for (Future<Integer> future : list) {
                System.out.println("Result is:" + future.get());
            }

            service.shutdown();

            if (!service.awaitTermination(20, TimeUnit.SECONDS)) {
                System.out.println("!!!! TIMES UP !!!!");
                service.shutdownNow();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException();
        }
    }

}
