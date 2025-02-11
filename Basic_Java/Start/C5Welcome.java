package Start;

import java.util.Scanner;
public class C5Welcome {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name );

        input.close();  // to prevent resource leak
    }
}


