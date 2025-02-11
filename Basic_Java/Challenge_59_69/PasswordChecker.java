package Challenge_59_69;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Pass = 2004;
        
        //Do-While loop to check password
        int pin;
        do{
            System.out.print("Enter your 4 digit PIN: ");
            pin = input.nextInt();
        }while(Pass != pin);
        System.out.println("Correct Password");
        input.close();
    }
}
