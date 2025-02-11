package Challenge89;

public class ConcatenateStrings {
    public static void main(String[] args) {
        System.out.println(concatenate("Sahil", "Patel"));
        System.out.println(concatenate("Sahil", "Patel", "is", "Good", "Boy."));
        System.out.println(concatenate("Sahil", "Patel", "is" ,"an","Engineering","Student."));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
