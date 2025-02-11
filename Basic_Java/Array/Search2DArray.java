
// Program to Search in 2D Array
package Array;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr2D = ArrayUtility.array2DInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter number you want to search: ");
        int num = input.nextInt();

        boolean found = Search2D(arr2D, num);
        if (found) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }

        input.close();
    }

    // 2D Array Searching
    public static boolean Search2D(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
