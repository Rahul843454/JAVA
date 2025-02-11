
// Program to Merge two Array
package Array;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.arrayInput();
        int[] arr2 = ArrayUtility.arrayInput();

        int[] mergedArray = merge(arr1 , arr2);
        ArrayUtility.displayArray(mergedArray);
    }

    // Function to merge two array
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArray = new int[newSize];

        int i=0, j=0, k=0;
        for(; i<arr1.length || j<arr2.length; ){
            if(j==arr2.length || i<arr1.length && arr1[i] < arr2[j]){
                newArray[k] = arr1[i];
                i++;
                k++;
            }else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }
}
