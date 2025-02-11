
// Program to find out Sum and Average of all the elements of an Array.
package Array;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average Calculator of an Array\n ");
      
        //Calling An Utility file which is created in the same folder
        int[] arr =ArrayUtility.arrayInput();

        long Sum = arraySum(arr);
        float Average = arrayAverage(arr);
        System.out.println("Sum of Array: " + Sum);
        System.out.println("Average of Array: " + Average);

        
    }

    //Function to calculate sum of all the elements of an Array
    public static long arraySum(int[] arr){
        long sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    // Function to find out the Average of all the elements in an Array
    public static float arrayAverage(int[] arr){
        long sum = arraySum(arr);
        float avg = (float) sum/arr.length;
        return avg;
    }

}
