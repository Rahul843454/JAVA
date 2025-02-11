package Challenge_59_69;

import Array.ArrayUtility;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();

        int sum = 0;
        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        System.out.println("Sum of all Positive number is: " + sum);
    }
}
