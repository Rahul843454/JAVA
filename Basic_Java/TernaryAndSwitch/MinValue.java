package TernaryAndSwitch;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second no: ");
        int num2 = input.nextInt();

        // Ternary Operator
        int output = num1 < num2? num1:num2;
        System.out.println(output + " is Minimum value");

        input.close();
    }
}
