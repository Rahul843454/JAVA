package Loop;
import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any desired no. for pattern printing: ");
        int num = input.nextInt();

        pattern1(num);
        pattern2(num);
        reversedRightPyramid(num); 
        input.close();
    }

    // Right Half Pyramid Pattern Function
    public static void pattern1( int num){
        for(int i = 0;i<num; i++){
            System.out.print("*");
            for(int j=1; j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Reversed Right Half Pyramid Pattern Funtion(another way)
    public static void reversedRightPyramid( int num){
        for(int i = num ;i>0; i--){
            
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Reversed Right Half Pyramid Pattern Funtion
    public static void pattern2( int num){
        for(int i = 1;i<=num; i++){
            System.out.print("*");
            for(int j=i; j<num;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Left hand Pyramid Pattern Function
    // public static void pattern3(){} 
}
