package Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadUsingExecutor {
    public static void main(String[] args) {
        //if you are using try with resource it will automatically handle exception and shutdown ,
        // so there is no need for service.shutdown
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintNum name1 = new PrintNum();
            service.submit(name1);
        }
    }
}
