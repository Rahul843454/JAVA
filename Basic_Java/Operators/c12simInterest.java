package Operators;

import java.util.*;
public class c12simInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Simple Interest Calculator");
        System.out.print("Enter the Principle amount(in rs.): ");
        float amt = input.nextFloat();
        System.out.print("Enter the time Period: ");
        float time = input.nextFloat();
        System.out.print("Enter Interest Rate: ");
        float rate = input.nextFloat();

        float simIntrest = (amt*time*rate)/100;
        System.out.println("Simple interest = " + simIntrest);

        input.close();  // to prevent resource leak

    }
}
