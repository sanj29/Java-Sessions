package Java8_Programs.ForEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImp implements Consumer<Integer>{


    @Override
    public void accept(Integer integer) {
        System.out.print(integer+" ");
    }
}
public class ForEachDemo {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(4,1,7,8,2,5,5,9);

        // Enhanced for loop
        for(Integer i : lst)
            System.out.print(i+" ");

        System.out.println(" ");

        //Using traditional For look,
        for(int i=0; i <lst.size(); i++)
            System.out.print(lst.get(i)+" ");

        System.out.println(" ");
        //Using forEach,
        lst.forEach(n-> System.out.print(n+" "));

        ConsImp consImp = new ConsImp();
        System.out.println("\nPrinting via consumer Impls class");
        lst.forEach(consImp);
    }
}
