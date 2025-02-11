package Start;

import java.util.Scanner;
public class C7Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second no:");
        int secondNum = input.nextInt();

        // int temp = firstNum;
        // firstNum = secondNum;
        // secondNum = temp;

        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
         System.out.println("Swapping done........");
        System.out.println("first number is = "+ firstNum + "\nsecond number is = " + secondNum);

        input.close();  // to prevent resource leak
    }
}
