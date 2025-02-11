package Array;

import java.util.*;

public class ArrayOccurrence {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no you want to search: ");
        int num= input.nextInt();

        int count = checkOccurrence(arr,num);
        System.out.println(num  +" is found "+ count +" times in the array. ");
        
        input.close();
    }

    // function to check occurrence time in an array while searching
    public static int checkOccurrence(int[] arr , int num){
         int count = 0;
        
         for(int i=0 ; i<arr.length; i++){
            if(num== arr[i]){
                count+=1;
            }
        }
        return count;
        
    }
}
