package Start;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumberMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = input.nextLine();

        System.out.print("Enter the second number: ");
        String num2 = input.nextLine();

        BigInteger result = multiplyLargeNumbers(num1, num2);
        System.out.println("Product: " + result);

        input.close();
    }

    public static BigInteger multiplyLargeNumbers(String num1, String num2) {
        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);

        return bigInt1.multiply(bigInt2);
    }
}

