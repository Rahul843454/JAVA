// Program to Find out minimum and maximum values from the array
package Array;

public class ArrayMaxMin {
    public static void main(String[] args) {
        System.out.println("\nMaximum and Minimum in An Array........\n");
        int[] arr = ArrayUtility.arrayInput();

        int max= arrMax(arr);
        int min= arrMin(arr);
        System.out.println("\nMaximum no. in the array is: " + max);
        System.out.print("Maximum no. in the array is: " + min);

    }

    // Function to find out maximum no. in the array
    public static int arrMax(int[] arr){
        int max=arr[0];                         //int min= Integer.MIN_VALUE; it can also be used
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //Function to find out minimum no. in the array
    public static int arrMin(int[] arr){
        int min = arr[0];                      //int min= Integer.MAX_VALUE; it can also be used
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min= arr[i];
            }
        }    
        return min;
    }
}
