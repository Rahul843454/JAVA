package Loop;
//Program to print Fibonacci Series(0,1,1,2,3,5,8,13.......)
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = input.nextInt();
        fiboSeries(num);
        
        input.close();
    }

    //Fibonacci function
    public static int fiboSeries(int num){
        int t1=0,t2=1;
        int nextTerm = t1 + t2;
        // print t1 & t2 before starting of loop
        System.out.print("Fibonacci series is: " + t1 +",");  
        System.out.print(t2);

        //loop will start after printing 2 terms(which is 0,1)
        for(int i=3; i<=num ; i++){
            System.out.print(","+nextTerm);
            t1=t2;
            t2=nextTerm;  
            nextTerm= t1 + t2;
        }return 0;
    }
}
