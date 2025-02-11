import java.util.Scanner;
public class c15negativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Number identifier!! \n\n");
        System.out.print("Enter a number to check:");
        int num = input.nextInt();

        // to check number is positive negative or zero
        if(num==0){
            System.out.println("Number is Zero");
        } else if(num < 0){
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Positive");
        }
        input.close();  // to prevent resource leak
    }
}
