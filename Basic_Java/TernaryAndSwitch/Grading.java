package TernaryAndSwitch;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Score: ");
        int score = input.nextInt();

        String output = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
        System.out.println("You Score is " + output);

        input.close();
    }
}
