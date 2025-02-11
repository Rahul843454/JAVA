package Loop;
import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        
        int Sum = sumOfOdd(num);
        System.out.println("Sum of all the odd numbers till "+num+" = "+Sum);
        
        input.close();
    }
    //Function defined to get sum of all the odd numbers
    public static int sumOfOdd(int a){
        int res =0;
        int i=1;
        for(i=1; i<=a; i+=2){
            res = res +i;
        }
        return res;
    }
}
