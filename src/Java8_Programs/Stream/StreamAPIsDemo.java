package Java8_Programs.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamAPIsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,35,6,77,77,12,67,34,9,90,34);
        Set<Integer> myset = new HashSet<>();
        nums.stream().filter(n -> !myset.add(n)).forEach(System.out::println);
    }
}
