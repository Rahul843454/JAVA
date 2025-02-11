package TernaryAndSwitch;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = input.nextInt();

        // Ternary Operation to get absolute value of any no.
        int output = num < 0? -(num): num;
        System.out.println("Absolute value of " + num +" is " + output);

        input.close();
    }
}
