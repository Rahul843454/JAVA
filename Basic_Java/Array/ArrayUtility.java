
//Created A utility which can be used in multiple program
package Array;

import java.util.*;
public class ArrayUtility {
    public static int[] arrayInput(){
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Size of the Array: ");
    int size = input.nextInt();
    int[] arr = new int[size];

    for(int i = 0;i<size;i++)
    {
        System.out.print("Enter value for " + (i + 1) + " position: ");
        arr[i] = input.nextInt();
    }

   return arr;
   
   } 

   // 2D Array input
   public static int[] [] array2DInput(){
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    System.out.print("Enter no. of the rows: ");
    int rows = input.nextInt();
    System.out.print("Enter no. of the column: ");
    int columns = input.nextInt();
    int[][] arr = new int[rows][columns];

    for(int i = 0;i<rows;i++)
    {
        for(int j=0; j<columns; j++){
            System.out.print("Enter value of rows: " + (i + 1) + " column: " + (j+1) +":");
            arr[i][j] = input.nextInt();
        } 
    }
   return arr;
   } 


//   Display array
    public static void displayArray(int[] arr){
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
    System.out.println(" ");
    }

}
