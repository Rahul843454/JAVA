package Operators;

import java.util.*;
public class c13comInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest calculator\n");
        System.out.print("Enter princple amount: ");
        float amt = input.nextFloat();
        System.out.print("Enter time period: ");
        float time = input.nextFloat();
        System.out.print("Enter Interest rate: ");
        float rate = input.nextFloat();

        double comInterest = amt*Math.pow((1+rate/100),time);
        comInterest -= amt; 
        System.out.println("Compound Interset is: " + comInterest);

        input.close();  // to prevent resource leak
    }
}
