package Challenge97;

public class TestingEnums {
    public static void main(String[] args) {

        for (DaysEnum day : DaysEnum.values()) {
            System.out.printf("%s : %s \n",day , day.getType());
        }
    }
}
