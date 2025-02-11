//Even Odd Program using Bitwise AND operator
package Bitwise;
import java.util.Scanner;

public class c27eoddbitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEven-Odd using Bitwise Operator........\n");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //Even odd using AND operator
        if((num & 1)==0){
            System.out.println(num + " is Even number");
        }else{
            System.out.println(num +" is Odd number");
        }
        input.close();
    }
}
