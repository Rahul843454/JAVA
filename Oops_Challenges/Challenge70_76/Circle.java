package Challenge70_76;

import java.util.Scanner;

public class Circle {

    double radiusInCms;

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    double areaOfCircle(){
        double area = Math.PI *Math.pow(radiusInCms, 2);
        return area;
    }

    double circumferenceOfCircle(){
        double circumference = 2*Math.PI*radiusInCms;
        return circumference;
    }

    @Override
    public String toString() {
       return "Circle [Radius: "+radiusInCms+", Circumference: "+circumferenceOfCircle()+", Area: "+areaOfCircle()+" ]";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area and Circumference Calculator..........\n");
        System.out.print("Please Enter Radius of the Circle: ");
        int rad = input.nextInt();

        Circle c1 = new Circle(rad);
        System.out.println(c1);
        input.close();
    }
}
   
