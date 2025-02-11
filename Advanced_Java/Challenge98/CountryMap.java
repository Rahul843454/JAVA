package Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("Srilanka", "Colombo");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();

        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s",country , countryMap.get(country));
        } else {
            System.out.println("Sorry We don't know the Capital"); 
        }
        input.close();
    }
}
