import java.util.Scanner;
public class c16evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check (Even/Odd): ");
        int num = input.nextInt();
        //To check even odd number
        if(num%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number ");
        }
        input.close();  // to prevent resource leak
    }
}
