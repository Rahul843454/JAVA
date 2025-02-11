

public class Car {
    
    int noOfWheels;
    String Color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;


 
    @Override
    public String toString() {
        return "Car [noOfWheels=" + noOfWheels + ", Color=" + Color + ", maxSpeed=" + maxSpeed
                + ", currentFuelInLitres=" + currentFuelInLitres + ", noOfSeats=" + noOfSeats + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public void drive(){
        System.out.println("Car is Driving...");
        currentFuelInLitres-- ;
    }

    public void addFuel(float fuel){
        currentFuelInLitres += fuel;
    }

    public void getCurrentFuelLevel(){
        System.out.println(currentFuelInLitres +" L");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Color = "red";

        System.out.println(c1);
    }
}
