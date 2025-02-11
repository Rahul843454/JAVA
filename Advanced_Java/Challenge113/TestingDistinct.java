package Challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,3,2,4,5,6,4,7,8,9,10,7);

       List<Integer> distinctNum = nums.stream()
            .distinct()
            .collect(Collectors.toList());

            System.out.println(nums);
            System.out.println(distinctNum);
    }
}
