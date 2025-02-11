package Challenge93;

import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

import Challenge92.ListElementSwapping;

public class ReverseElementOfList {
    public static void main(String[] args) {
        List <Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(numList);
        reverseList(numList);
        System.out.println(numList);
    }
    // Function to Swap Element of a List
    public static void reverseList(List <Integer> list){

        // Collections.reverse(list);

        for (int i = 0; i < list.size()/2; i++) {
            ListElementSwapping.Swap(list, i, list.size()-i-1); // using Challenge92 swap function
        }
    }
}
