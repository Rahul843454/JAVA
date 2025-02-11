package Loop;
// Program to Reverse number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num = input.nextInt();
        int reverseNumber = reverseNum(num);
        System.out.println("reversed no is: " + reverseNumber);

        input.close();
    }
    //function to reverse no
    public static int reverseNum(int n1){    
        int revNum = 0;
        //we can also declare a for loop without initialization and increement/decrement just by adding a ; which means there is nothing to initialize loop will only work with given condition.
        for(;n1>0 ;){        
            revNum = revNum*10 + (n1%10);
            n1=n1/10;
        }return revNum;
    }
}