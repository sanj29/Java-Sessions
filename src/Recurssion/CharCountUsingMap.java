package Recurssion;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingMap {

    public static void main(String[] args) {
        String s ="My Name is Aniket Shelke and I am QA lead";
        eacCharCnt(s.toLowerCase());
    }
    public static void eacCharCnt(String str) {

        //char[] c = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==' ')
                continue;
            if (charMap.get(str.charAt(i)) != null) {
                charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
            }
            else
                charMap.put(str.charAt(i), 1);
        }
        for(Map.Entry<Character, Integer> ch : charMap.entrySet())
            System.out.println(ch.getKey() +"->"+ ch.getValue()+" ");

    }
}
