package Challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficLightcolor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficLightcolor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficLightcolor.GREEN);
        
        red.start();
        red.join();
        
        yellow.start();
        yellow.join();

        green.start();
        green.join();

    }
}
