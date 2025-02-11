package TernaryAndSwitch;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = input.nextInt();

        // Ternary Operator to check even odd 
        String output = num%2==0 ? "Even" : "Odd";
        System.out.println(num + " is " + output + " number");

        input.close();
    }
}
