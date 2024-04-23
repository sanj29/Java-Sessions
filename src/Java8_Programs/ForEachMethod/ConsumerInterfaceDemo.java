package Java8_Programs.ForEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
@FunctionalInterface
 interface  getNameFromLst{
     void getEvenNum(List<Integer> numlst);
}
public class ConsumerInterfaceDemo implements Consumer<List<String>>{

    @Override
    public void accept(List<String> lst) {
       for(String s: lst) {
           if(s.startsWith("A")&& s.length()>=4)
                System.out.println(s);
       }
    }

    public static void main(String[] args) {
        List<String> lstName= Arrays.asList("Sanjay","Aman","Ajai", "Aishwarya","Aakash");
        List<Integer> numLst = Arrays.asList(2,3,5,7,8,823,4,40);
        ConsumerInterfaceDemo cid= new ConsumerInterfaceDemo();
        cid.accept(lstName);


        numLst.forEach(n -> {
            if (n%2==0)
                System.out.println(n);
        } );


        getNameFromLst getNameFromLst = (n) ->{
            for(Integer i:n) {
                if (i % 2 == 0)
                    System.out.println(i);
            }
        };

        getNameFromLst.getEvenNum(numLst);
    }

    }
