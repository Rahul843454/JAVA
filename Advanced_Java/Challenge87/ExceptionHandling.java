package Challenge87;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int first = input.nextInt();
        System.out.println("Enter the divisor: ");
        int second = input.nextInt();

        try{
            int res = first/second;
            int remain = first%second;
            System.out.println("Quotient is: " + res);
            System.out.println("Remainder is: "+remain);
        }catch(ArithmeticException e){
            System.out.println("Can't Divide by Zero, Try something else");

        }
        input.close();
    }
}
