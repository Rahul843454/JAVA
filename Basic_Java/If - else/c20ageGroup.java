import java.util.Scanner;

public class c20ageGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        //categorizing into different age group
        if(age < 13){
            System.out.println("You are a Child ");
        }else if(age <=20 ){
            System.out.println("You are a Teen");
        }else if(age <= 60){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are Senior Citizen");
        }
        input.close();
    }
}
