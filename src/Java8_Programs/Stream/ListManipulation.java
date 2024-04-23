package Java8_Programs.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListManipulation {
    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();

        List<String> nameList = Arrays.asList("Aman", "Aishwarya", "Sanjay", "Ajaya", "Aryan" ,"AA");
        funct obj = new funct(){
            @Override
            public void getName(List<String> nameLst) {
                Stream<String> s1 =nameLst.stream();
                s1.filter(n -> n.startsWith("A")&& n.length() >=4).forEach(System.out::println);

            }
        };
        obj.getName(nameList);

        /*

       s1.forEach(name -> {
                    if(name.charAt(0)=='A' && name.length()>=4)
                        System.out.println(name);
                });
         */
    }
}


