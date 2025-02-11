
//Program to Search Any number in Array
package Array;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to Array Seaching..... \n");
        System.out.print("Enter the number you want to Search: ");
        int num = input.nextInt();
        int[] myArr ={1,2,3,4,5,10,76,98,88};

        boolean res = isPresent(myArr, num);

        if(res){
            System.out.println("Number Found");
        }else{
            System.out.println("Not Found");
        }

        input.close();
    }

    //Function to search number in the array. 
    public static boolean isPresent(int[] myArr,int num){
        for(int i=0; i<myArr.length; i++){
            if(myArr[i] == num){
                return true;
            }
        }
        return false;
    }
}
