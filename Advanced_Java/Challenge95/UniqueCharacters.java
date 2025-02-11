package Challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.print("Please enter any String: ");
        String userStr = input.next();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        // We Know that Set do not allow duplicate elements. So when a duplicate char will occur,
        // it will not added to Set.
        // We can use .size() method to get unique characters in the Set.
        System.out.printf("Your String has %d Unique Characters", unique.size());

        input.close();
    }
}
