package Challenge112;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(isOptional(null));
        System.out.println(isOptional(""));
        System.out.println(isOptional("Hello"));
        
    }
    public static Optional<String> isOptional(String str){
        if(str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
