package Loop;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no. for Factorial: ");
        int num = input.nextInt();

        int res = facto(num);
        System.out.println("Factorial of "+ num +" = "+res);

        input.close();
    }
    public static int facto(int a){
        int i=1;
        int r=1;
        for(i=1;i<=a;i++){
            r=r*i;
        }
        return r;
    }
}
