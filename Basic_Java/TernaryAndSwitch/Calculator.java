package TernaryAndSwitch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator....\n");
        System.out.println("Select an option you want to perform");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your Choice from above options: ");
        int choice = input.nextInt();

        System.out.print("Enter First number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        int res = getCalculataion(choice, num1, num2);
        System.out.println("Result is " +res);

        input.close();
    }

    // Calculator Function
    public static  int getCalculataion(int choice, int num1, int num2){
        return switch(choice){
            case 1 -> num1 + num2;
            case 2 ->num1 - num2; 
            case 3 -> num1 * num2;
            case 4 ->num1 / num2; 
            default -> 0;
        };
    }
}
