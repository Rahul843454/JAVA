package Loop;
//Program to print LCM of two numbers
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" \nWelcome to LCM calculator... \n");
        System.out.print("Enter first no: ");
        int first = input.nextInt();
        System.out.print("Enter second no: ");
        int second = input.nextInt();

        int lcm = lcmOf(first,second);
        System.out.println("Lcm is: " + lcm);

        input.close();
    }

    //Function for LCM
    public static int lcmOf(int first, int second){
        for(int i=1; i<=second;i++){
            int multiple = first*i;
            if(multiple % second == 0){
                return multiple;
            }
        }
        return 0;
    }
}
