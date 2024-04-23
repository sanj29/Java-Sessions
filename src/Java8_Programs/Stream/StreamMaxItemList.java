package Java8_Programs.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMaxItemList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,35,6,17,77,1732,167,34,189,90);

        int max= nums.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
