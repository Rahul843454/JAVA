package Challenge70_76;

import java.util.Scanner;

public class GuessingGame {
    
    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }

    void getNumber(){
        System.out.println(random);
    }

    int guess(int num){
        return num - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the Game. Guess number from 1 to 100\n");
        // game.getNumber();
        
        int myguess;
        int res;
        do{
            System.out.print("Enter your Guessing: ");
            myguess = input.nextInt();
            res = game.guess(myguess);
            if(res < 0){
                System.out.println("Your Guess is Smaller");
            }else if (res > 0) {
                System.out.println("Your Guess is Larger");
            }else{
                System.out.println("Congrats, You guessed right");
            }

        }while(res != 0);

        input.close();
    }
}


