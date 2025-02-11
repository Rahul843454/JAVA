package Challenge_59_69;

import java.util.Scanner;

import Array.ArrayUtility;

public class OccurenceUsingForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.arrayInput();
        System.out.print("Enter any number to know its occurence: ");
        int num = input.nextInt();

        int count = isOccurrence(arr, num);
        System.out.println("Occurrence : " + count);

        input.close();
    }

    //Function using ForEach loop to check number of Occurence
    public static int isOccurrence(int[] arr, int num){

        int count = 0;
        for(int n : arr){
            if(n == num){
                count++;
            }
        }
        return count;
    }
}
