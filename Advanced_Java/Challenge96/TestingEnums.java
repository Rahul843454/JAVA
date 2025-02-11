package Challenge96;

public class TestingEnums {
    public static void main(String[] args) {

        System.out.println(DaysEnum.Monday);
        System.out.println(DaysEnum.Tuesday);
        System.out.println(DaysEnum.Wednesday);
        System.out.println(DaysEnum.Thursday);
        System.out.println(DaysEnum.Friday);
        System.out.println(DaysEnum.Saturday);
        System.out.println(DaysEnum.Sunday);
//  Loop with .values() method which makes array of all days in enum 
        for (DaysEnum day : DaysEnum.values()) {
            System.out.println(day);
        }
    }
}
