














package Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();

        boolean increasing = isIncreasing(arr);
        boolean decreasing = isDecreasing(arr);

        if(increasing || decreasing){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
        
    }

    //Function to check array is sorted or not
    public static boolean isIncreasing (int[] arr){
        for(int i=1; i<arr.length; i++){
            // supposed array is 5,4 it means if condition is true it return false because 
            // we know in increasing order, must be in 4,5 sequence. 
            if(arr[i-1] > arr[i]){
                return false;    
            }
        }
        return true; 
    }

      //Function to check array is sorted or not
      public static boolean isDecreasing (int[] arr){
        for(int i=1; i<arr.length; i++){
            // supposed array is 4,5 it means if condition is true it return false because we know 
            // in decreasing order ,must be in 5,4 sequence. 
            if(arr[i-1] < arr[i]){
                return false;       
            }
        }
        return true; 
    }
}
