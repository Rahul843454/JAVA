package Challenge100;

public class ThreadState  extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("Inside run: %s",getState());
        } catch (InterruptedException e) {
            System.out.printf("InterruptedException occurs");
        }
    }
}
