package Challenge70_76;

public class ArrayStringBuilder {
    public static void main(String[] args) {
        String[] arr = new String[]{
            "Hello," , "Jai", "Hind.", "My", "name", "is", "Sahil", "Patel"
        };

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
