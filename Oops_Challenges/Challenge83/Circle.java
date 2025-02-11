package Challenge83;

public class Circle extends Shape{
    private double radius;

     
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        double ar = Math.PI*Math.pow(radius, 2);
        return ar;
    }
}
