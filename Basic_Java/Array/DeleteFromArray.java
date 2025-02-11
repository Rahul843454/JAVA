package Array;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to delete from the array: ");
        int num = input.nextInt();

        int[] newArr = Delete(arr, num); 
        printArray(newArr);
        input.close();
    }

    //Function to delete an element from the array
    public static int[] Delete(int[] arr, int num ){
        //first we check how many times num occurs which we want to delete
        // i used previous program to check no. of occurrence
        int occ = ArrayOccurrence.checkOccurrence(arr, num);
        if(occ==0){
            return arr;
        }
        //now we deicide newArray length
        int nsize = arr.length - occ;
        int[] newArr = new int[nsize];

        int i = 0, j = 0;
        for(i=0; i<arr.length; i++){
            if(arr[i] != num){
                newArr[j]= arr[i];
                j++;
            }
        }
        return newArr;
    }

    //Function to print Array
    public static void printArray(int[] newArr){
        for(int j=0; j<newArr.length; j++){
            System.out.print(newArr[j] + " ");
        }
    }
}
