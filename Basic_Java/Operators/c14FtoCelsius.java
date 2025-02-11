package Operators;

import java.util.*;
public class c14FtoCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fehrenheit to Celsius Converter \n");
        System.out.print("Enter fehrenheit you want to convert: ");
        float feh = input.nextFloat();
        float cel = (feh - 32) * 5/9;

        System.out.println("Celsius = " + cel);
        
        input.close();  // to prevent resource leak
    }
}
