package Challenge115;

import java.util.List;

public class SquareofString {
    public static void main(String[] args) {
        List<String> nums = List.of("1","2","3","4","5","6","7");

        nums.stream()
            .map(Integer::parseInt) //it will conver string value to int
            .map(num -> Math.pow(num,2)) // it will find out square of each num
            .reduce(Double::sum) // it will add all the nums 
            .ifPresent(System.out::println); // it will print sum 
    }
}
