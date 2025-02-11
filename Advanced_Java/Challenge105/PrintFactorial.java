package Challenge105;

import java.util.concurrent.Callable;

public class PrintFactorial implements Callable<Integer> {

    private int num;

    public PrintFactorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
