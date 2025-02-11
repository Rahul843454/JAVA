package Challenge100;

public class TestingThreadStates {
    public static void main (String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Created Thread: %s \n", t1.getState());

        t1.start();

        t1.join();

        System.out.printf("\nTask ended: %s", t1.getState());
    }
}
