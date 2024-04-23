package Java8_Programs.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDouble {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,14,6,7,2,3,4);

        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };

        /*** Conversion of above predi in Lambda
         * Predicate<Integer> predi = n -> n%2 == 0;
         *
         *
         */

        Function<Integer, Integer> funct = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return  n*2;
            }
        };
        /*** Conversion of above Funct in Lambda
         * Function<Integer, Integer> funct = n->n*2;
         *
         */

        BiFunction<Integer, Integer, Integer> bi = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer n, Integer u) {
                return n+u;
            }
        };
        Stream<Integer> data = nums.stream();
       // Stream<Integer> data1 = nums.stream();
       /* System.out.println(data.count()); // count
        System.out.println(data.findFirst()); // get first item
        data.sorted().forEach(n -> System.out.println(n)); // sort n print
        data.forEach(n-> System.out.println(n*2)); // double the values */

       int res= nums.stream()
                .filter(predi)
                .map(funct)
                .reduce(0,(c,e)->c+e); // start point for sum or minus-->
        System.out.println("sum of nums: "+res);

        nums.stream()
                .filter(predi)
                .map(funct)
                .forEach(n -> System.out.println(n));
    }
}
