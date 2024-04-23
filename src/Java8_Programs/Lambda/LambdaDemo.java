package Java8_Programs.Lambda;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface myInt {

    void show(List<Integer> i);
}

public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,4,5,6,7,8,9);

       // values.forEach(i ->System.out.print(i+" "));
        myInt mobj;
        mobj = ( i) -> System.out.print(i+" ");
        mobj.show((values));

    }


}
