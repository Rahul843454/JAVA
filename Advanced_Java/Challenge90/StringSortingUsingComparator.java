package Challenge90;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortingUsingComparator {
    public static void main(String[] args) {

        List<String> strlist = Arrays.asList("Apple", "Orange", "Banana","Cherry","Plum","Lemon","Mango","Blueberry");
        System.out.println(strlist);
        stringSortingInDescending(strlist);
        System.out.println(strlist);

    }

    public static void stringSortingInDescending(List<String> stringlist) {
        Collections.sort(stringlist, new java.util.Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                if (s1.equals(s2)) {
                    return 0;
                } else if (s1.charAt(0) < s2.charAt(0)) {
                    return 1; 
                } else {
                    return -1;
                }
            }
        });
    }
}
