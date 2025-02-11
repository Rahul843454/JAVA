package Loop;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int aNum = toCheckArmstrong(num);

        input.close();
        //if else to check returned value with inputted number
        if(aNum==num){
            System.out.println(num +" is Armstrong number");
        }else{
            System.out.println(num +" is not Armstrong number");
        }
    }

    // Function to find out the length of int value
    public static int lengthOf(int n1) {
        String number = String.valueOf(n1);
        int length = number.length();
        return length;
    }

    // Power Function
    public static int powerOf(int base, int exponent){
        int res=1;
        for(int i=1; i<=exponent;i++){
             res*= base;
        }
        return res;
    }

    // Function to check number is Armstrong or not
    public static int toCheckArmstrong(int n1){
        int length = lengthOf(n1);
        int sum = 0;
        for(; n1>0; ){
            int digit = n1%10;
            n1=n1/10;
            sum += powerOf(digit, length);
        }
        return sum;
    }
}
