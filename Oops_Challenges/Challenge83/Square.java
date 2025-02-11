package Challenge83;

public class Square  extends Shape{
    private double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    @Override
    public double calculateArea() {
         double area = Math.pow(sideInCm,2);
         return area;
    }
}
