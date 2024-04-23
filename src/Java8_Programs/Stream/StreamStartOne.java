package Java8_Programs.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamStartOne {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(12,35,6,17,77,1732,167,34,189,90);

        nums.stream()
                .map(s -> s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
