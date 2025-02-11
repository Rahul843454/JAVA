
//Program to Find out Sum and Average of all the elements in 2D Array 
package Array;

public class Arr2DSumAverage {
    public static void main(String[] args) {
        int[][] arr2D = ArrayUtility.array2DInput();
        
        long sum = sum2D(arr2D);
        double avg = avg2D(arr2D);
        System.out.println("Sum of all the elements of 2D is: " + sum);
        System.out.println("Average of all the elements of 2D array is: " + avg);
    }

    // 2D array Sum of all the elements
    public static long sum2D(int[][] arr){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }

    // Average of 2D Array
    public static double avg2D(int[][] arr){
        if(arr.length == 0){
            return 0;
        }

        int rows = arr.length;
        int columns = arr[0].length;
        double size = rows*columns;
        double avg = sum2D(arr)/size;

        return avg;
    }
}
