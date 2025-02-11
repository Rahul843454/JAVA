package Challenge83;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double rad = input.nextDouble();
        System.out.print("Enter the side of square: ");
        double s = input.nextDouble();

        Circle c1 = new Circle(rad);
        Square s1 = new Square(s);

        System.out.println("Area of Circle = " + c1.calculateArea());
        System.out.println("Area of Square = " + s1.calculateArea());

        input.close();
    }
}
