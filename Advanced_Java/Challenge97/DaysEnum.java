package Challenge97;

public enum DaysEnum {
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    private final boolean isWeekday;

    private DaysEnum(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    
    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";  
    }
}
