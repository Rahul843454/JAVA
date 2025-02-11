package Start;

import java.util.Scanner;
public class C6Sum {
    public static void main(String[] args) {
        System.out.println("Enter first no:");
        Scanner input = new Scanner(System.in);  
        int a = input.nextInt();
        System.out.println("Enter second no. ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum); 
        input.close();  // to prevent resource leak
    }
}
