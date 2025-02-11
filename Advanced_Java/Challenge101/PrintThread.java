package Challenge101;

public class PrintThread extends Thread {
    private final int num;

    public PrintThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread starting: %d \n", Thread.currentThread().getName(), num);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occurs");
        }

        System.out.printf("%s Thread Ended: %d\n", Thread.currentThread().getName(), num);

    }
}
