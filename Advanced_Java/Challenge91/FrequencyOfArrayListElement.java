package Challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FrequencyOfArrayListElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.asList("Apple", "Orange", "Lemon", "Banana", "Cherry", "Plum", "Lemon", "Lemon",
                "Mango", "Blueberry", "Lemon");
        System.out.println("Enter fruit name you want to whose occurence: ");
        String fruit = input.next();
        int count = Collections.frequency(list, fruit);
        System.out.printf("Frequency of %s is %d",fruit,count);

        input.close();
    }
}
