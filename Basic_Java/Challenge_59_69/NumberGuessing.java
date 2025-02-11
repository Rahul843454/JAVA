package Challenge_59_69;

import java.util.Scanner;

public class NumberGuessing {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 7;

    int guess;
    do{
        System.out.println("Guess your number: ");
        guess = input.nextInt();
    }while(guess != num);
    System.out.println("Correct guessing");

    input.close();
   }
}
