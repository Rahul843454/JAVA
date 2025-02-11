package Challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Sahil", "Patel","Abhijeet","Kumar","Ravi","Agaj","Ishwar");

        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
