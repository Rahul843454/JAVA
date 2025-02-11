import java.util.Scanner;

public class c18leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year identifier....\n");
        System.out.print("Enter year: ");
        int yrs = input.nextInt();
        //To check leap year
        if((yrs % 400 == 0) || (yrs % 4 == 0 && yrs % 100 != 0)){
            System.out.println(yrs +" is  a leap year");
        }else{
            System.out.println(yrs + " is not a leap year");
        }
        input.close();
    }
}
