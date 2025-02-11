package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();

        reverse(arr);

        ArrayUtility.displayArray(arr);
    }

    public static void reverse(int[] arr) {
        // iterate only half of the array
        for (int i = 0; i <= arr.length / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
        }
    }
}
