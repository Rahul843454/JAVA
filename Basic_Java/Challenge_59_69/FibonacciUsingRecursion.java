package Challenge_59_69;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = input.nextInt();

        for(int i=0; i<num ; i++){
            System.out.println(fibonacci(i) + " ");
        }

       

        input.close();
    }

    // Function for recursion to get fibonacci
    public static int fibonacci(int position){
        //to check how many time function calling happens
        System.out.print(".");
        if(position == 0){
            return 0;
        }
        if(position == 1){
            return 1;
        }
        
        int fibo = fibonacci(position-1) + fibonacci(position-2);
        return fibo;
    }
}
