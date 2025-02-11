
// Program to find out sum of all the diagonal elements of 2D Array
package Array;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        int[][] arr2D = ArrayUtility.array2DInput();

        long sumOfDiagonal = sumOfDiagonal(arr2D);
        System.out.println("Sum of all the diagonal elements in 2D array is: " + sumOfDiagonal);
    }
    // Function to add diagonal 
    public static long sumOfDiagonal(int[][] arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum +rightSum;

        if(arr.length % 2 != 0){
            int index = arr.length/2;
            sum -= arr[index][index];
        }
        return sum;
    }

    // Function to get sum of Left Diagonal 
    public static long sumOfLeftDiagonal(int[][] arr){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }

    // Function to get sum of Right Diagonal
    public static long sumOfRightDiagonal(int[][] arr){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            int col =(arr.length - 1) -i;
            sum +=arr[i][col];
        }
        return sum;
    }
}
