package leetcode.StringNArray;

import java.util.*;
 public class ListSum{
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        int k=17;
        ls.add(10);
        ls.add(15);
        ls.add(3);
        ls.add(7);
        ls.add(4);
        ls.add(41);
        int j=ls.size()-1;
        int i =0;
        int sum=0;

        while(i <j){
            sum=ls.get(i)+ls.get(j);
            System.out.println(sum);
            if(k==sum){
                System.out.println("Ture");
                break;
            }
            j--;
            // j=j+1;
        }

    }
}