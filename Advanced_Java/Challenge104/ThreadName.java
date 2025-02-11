package Challenge104;

public class ThreadName implements Runnable{
    
    @Override
    public void run() {
        System.out.println("Started Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(getRandom());
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }

        System.out.println("Ended Thread: " + Thread.currentThread().getName());
    }

    private int getRandom(){
        double random = Math.random()*5 +1;
        return (int) random*1000;
    }
}
