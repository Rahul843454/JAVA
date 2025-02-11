package Challenge_59_69;

import Array.ArrayUtility;

public class PrintEvenNumber {
    public static void main(String[] args) {

        int[] arr = ArrayUtility.arrayInput();

        System.out.println( "\nEven numbers are :-");
        for (int num : arr) {
            if (num %2 != 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
