package Challenge92;

import java.util.Arrays;
import java.util.List;

public class ListElementSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,1,4,5,6,3,7,8,9,43,12,65);
        System.out.println(list);
        Swap(list, 5, 10);
        System.out.println(list);
    }

    public static void Swap(List<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);
    }
}
