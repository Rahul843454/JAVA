package Challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("I am Sahil Patel", "I am from Bihar", "Jai hind", "sahil");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
