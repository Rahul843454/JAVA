//Program to add Digits of any number
package Loop;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = input.nextInt();

        int res = sumOfDigits(num);
        System.out.println("Sum of Given Digits is: " + res);
        input.close();
    }
    public static int sumOfDigits(int a){
        int sum =0;
        for(sum = 0;a>0;a/=10){
            sum +=a%10;
        }
        return sum;
    }
}
