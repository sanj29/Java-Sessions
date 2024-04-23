package Java8_Programs.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamEvenNumber {
    public static void main(String[] args) {

        List<Integer> nums =Arrays.asList(12,35,6,7,77,732,67,34,89,90);
        nums.stream().filter(n -> n%2==0).forEach(System.out::println);

    }
}
