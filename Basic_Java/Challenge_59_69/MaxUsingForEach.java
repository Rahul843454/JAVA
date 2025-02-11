package Challenge_59_69;

import Array.ArrayUtility;

public class MaxUsingForEach {
   public static void main(String[] args) {
    int[] arr = ArrayUtility.arrayInput();
    
    System.out.println("Maximum no in thye array is: " + isMAx(arr));
    
   }

   //Function using for each to get maximum no. in array
   public static int isMAx(int[] arr){
        int max=arr[0];
        for(int num : arr){
            if(max < num){
                max = num;
            }
        }
        return max;
   } 

}
