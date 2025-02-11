package Loop;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int reverseNumber = reverseNum(num);
        // to compare num with reverseNumber
        if(num == reverseNumber){
            System.out.println(num +" is a Palindrome number");
        }else{
            System.out.println(num +" is a Palindrome number");
        }

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
