package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareStringBasedOnLength {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Sanjay","Ajai","Kajal","Bhavya","Shubj");

    /*    Comparator<String> comp = new Comparator<String>() {   lambda representation of this code in line num23
            @Override
            public int compare(String o1, String o2) {
                return o1.length()>o2.length() ? 1 : -1;
            }
        } ;*/

        //Comparator<String> compByName = (String o1, String o2)-> o1.compareTo(o2);

        nameList.sort((o1,o2) -> o1.length()>o2.length() ? 1 : -1);
        System.out.println(nameList);

        nameList.sort((o1,o2)-> o1.compareTo(o2));
        System.out.println(nameList);
    }
}
