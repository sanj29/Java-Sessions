package Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class catcount {
    public static void main(String[] args) {



        String str = "My Name is Estebab Gutiérrez";
        System.out.println(str.toLowerCase());
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            al.add(str.charAt(i));
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.putIfAbsent(al.get(i),
                    Collections.frequency(al, al.get(i)));

        }

        for (Map.Entry<Character,Integer> e :hm.entrySet()){
            System.out.println("Character is :"+e.getKey()+ " and duplicate count is string "+ e.getValue());
        }


    }
    public static int[] getDivionArray(int[] ar){

        int[] res= new int[ar.length];

        return res;
    }
}