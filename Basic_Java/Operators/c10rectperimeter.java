package Operators;

import java.util.*;
public class c10rectperimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter length of the rectangle(in cm): ");
        double length = input.nextFloat();
        System.out.print("Please enter the width of the rectangle(in cm): ");
        double width = input.nextFloat();

        double peri = 2*(length + width);
        System.out.println("Perimeter of the rectangle is: " + peri + " cms");

        input.close();  // to prevent resource leak

    }
}    
