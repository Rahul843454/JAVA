import java.util.Scanner;

public class c19grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator......\n");
        System.out.println("Enter marks of all the 5 subjects");
        float eng = input.nextFloat();
        float hindi = input.nextFloat();
        float math = input.nextFloat();
        float science = input.nextFloat();
        float ssc = input.nextFloat();
        //average or percentage 
        float avg = (eng+hindi+math+science+ssc)/5;
        //grading
        if(avg >= 90){
            System.out.println("You got "+ avg +"%");
            System.out.println("Grade A");
        } else if(avg < 90 && avg >= 75){
            System.out.println("You got "+ avg +"%");
            System.out.println("Grade B");
        } else if(avg < 75 && avg >= 60 ){
            System.out.println("You got "+ avg +"%");
            System.out.println("Grade C");
        }else if(avg < 60 && avg >= 30){
            System.out.println("You got "+ avg +"%");
            System.out.println("Grade D");
        }else{
            System.out.println("You got "+ avg +"%");
            System.out.println("You are Fail");
        }
        input.close(); //To prevent resource leak 
    }
}
