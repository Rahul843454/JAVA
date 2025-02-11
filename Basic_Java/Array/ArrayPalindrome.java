package Array;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();
        boolean palindrome = isPAlindrome(arr);
        
        if(palindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not Palindrome");
        }
    
    }

    // Function to check number is Palindrome or not
    public static boolean isPAlindrome(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
