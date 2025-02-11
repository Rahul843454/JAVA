package Loop;
//Program to print HCF of two numbers
import java.util.Scanner;

public class Hcf {  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" \nWelcome to HCF calculator... \n");
        System.out.print("Enter first no: ");
        int first = input.nextInt();
        System.out.print("Enter second no: ");
        int second = input.nextInt();

        int hcf = hcfOf(first,second);
        System.out.println("HCF is: " + hcf);

        input.close();
    }

    //Funtion to find out HCF 
    public static int hcfOf(int n1, int n2){
        int hcf = 0;
        int small = least(n1, n2);
        for(int i = 1; i<=small; i++){
             if(n1%i==0 && n2%i==0){
                hcf = i;
             }
        }
        return hcf;
    }

    // function to find out smallest no.
    public static int least(int n1, int n2){
        if(n1<n2){
            return n1;
        }else {
           return n2;
        }
    }
}
