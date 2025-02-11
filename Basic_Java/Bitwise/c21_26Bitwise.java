package Bitwise;
import java.util.Scanner;

public class c21_26Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nBitwise Operator Testing\n ");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        //AND Bitwise operator
        int res1 = first & second;
        //OR Bitwise Operator
        int res2 = first | second;
        //XOR Bitwise Operator
        int res3 = first ^ second;
        //NOT Bitwise Operator 
        int res4 = ~first;
        //Left Shift Operator 
        int res5 = first<<1;  //it will shift binary of 'first' by 1 position towards left side
        //Right Shift Operator
        int res6 = first>>2;  //it will shift binary of 'first' by 2 position towards right side

        // Printing all the results
        System.out.println("AND of "+ first + " and " + second + " is: "+ res1 );
        System.out.println("OR of "+ first + " and " + second + " is: "+ res2 );
        System.out.println("XOR of "+ first + " and " + second + " is: "+ res3 );
        System.out.println("NOT of "+ first + " is: "+ res4 );
        System.out.println("Left Shift of "+ first +" is: "+ res5 );
        System.out.println("Right Shift of "+ first + " is: "+ res6 );

        input.close(); 
    }
}
