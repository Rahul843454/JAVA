package Challenge_59_69;

import java.util.Scanner;

public class ExitToExitBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter your Command:");
            String Command = input.nextLine();
            if(Command.equals("exit")){
                break;
            }
        }
        System.out.println("Successfully Exited ");
        input.close();
    }
}
                                            