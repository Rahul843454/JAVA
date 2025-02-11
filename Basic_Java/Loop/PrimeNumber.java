package Loop;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Prime Number identifier......\n");
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        boolean res = isPrime(num);
        if(res){
            System.out.println(num + " is Prime number");
        }else {
            System.out.println(num + " is not a Prime number");
        }
        input.close();
    }

    //Function to find out number is Prime or not
    public static boolean isPrime(int n){
        // no. which is 1 or less than 1 is not a prime number    
        if(n<=1){
            return false;
        }
        // for no. greater than 2  
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        // return true means number is prime 
        return true;
    }

}
