package Operators;

import java.util.*;
public class c8Airthmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calcultor");
        System.out.print("Please enter first no: ");
        int first = input.nextInt();
        System.out.print("Please enter second no: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int rem = first % second;

        System.out.println("Sum is: " + add);
        System.out.println("Difference is: " + sub);
        System.out.println("Product is: " + mul);
        System.out.println("Quotient is: " + div);
        System.out.println("Remainder is: " + rem);

        input.close();  // to prevent resource leak
    }
}
