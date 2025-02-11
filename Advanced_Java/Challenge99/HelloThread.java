package Challenge99;

public class HelloThread extends Thread {
    private final int ThreadNumber;
    
    public HelloThread(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+". Hello From thread "+ ThreadNumber);
        }
    };
}
