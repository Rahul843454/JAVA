package Operators;

import java.util.*;
public class c11triarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Base(in cm): ");
        double base = input.nextDouble();
        System.out.print("Enter the value of Height(in cm): ");
        double height = input.nextDouble();

        double area = (base*height)/2;
        System.out.println("Area of traiangle is: " + area +" sq.cm");

        input.close();  // to prevent resource leak
    }
}
