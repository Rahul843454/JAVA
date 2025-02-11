package Challenge77.uttils;

import Challenge77.geometry.*;

public class Calculator {
  public static void main(String[] args) {
    circle cir = new circle(2);
    Rectangle rec = new Rectangle(3.9, 4);

    double areaOfCircle = Math.PI *Math.pow(cir.radiusInCms, 2);
    double areaOfRectangle = rec.length * rec.breadth;

    System.out.printf("Area of Circle = %f, Area of Rectangle = %f",areaOfCircle,areaOfRectangle);
  } 
}
