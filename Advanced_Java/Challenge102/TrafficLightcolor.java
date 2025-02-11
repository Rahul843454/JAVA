package Challenge102;

enum TrafficLightcolor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;
    

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }


    private TrafficLightcolor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }
    
}
