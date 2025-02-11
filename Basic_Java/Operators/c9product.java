package Operators;

import java.util.*;

public class c9product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        double first = input.nextDouble();
        System.out.print("Please enter second number: ");
        double second = input.nextDouble();

        double prod = first * second;
        System.out.println("Product is: " + prod);

        input.close(); // to prevent resource leak
    }
}
