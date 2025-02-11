package Challenge_59_69;

import java.util.Scanner;

public class PalindromUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to Palindrome Checker.....\n");
        System.out.print("Enter the String to be checked: ");
        String str = input.next();

        boolean output = isPalindrome(str);
        if(output){
            System.out.println(str + " is Palindrome");
        }else {
            System.out.println(str + " is not Palindrome");
        }

        input.close();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str){
        //to check how many time function calling happens
        // System.out.print(".");

        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() -1;
        //charAt() is used to check character of string at given index 
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        //substring(beginning index, ending index) will create a substring of the original string 
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
 