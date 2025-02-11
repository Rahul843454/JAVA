package Challenge102;

public class TrafficLightThread extends Thread {
    private final TrafficLightcolor color;

    public TrafficLightThread(TrafficLightcolor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active \n", color);
        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s inactive \n", color);

    }
}
