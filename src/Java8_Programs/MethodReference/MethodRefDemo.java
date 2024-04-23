package Java8_Programs.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {

    public static void main(String[] args) {
        List<Integer > lstNum = Arrays.asList(1,2,3,4,5,6,7,7,8,9);

        lstNum.forEach(i->System.out.print(i+" ")); // :: is used for method reference, Print/Println is method

        List<Integer> lengths = Arrays.asList(1, 2, 3, 4);
        System.out.println("\n");
        lengths.stream().map(String::valueOf).forEach(System.out::println);
    }
}
