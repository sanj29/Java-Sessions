package Recurssion;

import java.util.Scanner;

public class CountOccuranceOfChar1{

    public static void main(String[] args) {

        getEachCharCountUsingCounter("My name is Tanushri Mukherjee Chakraborty");
    }

    public static void getEachCharCountUsingCounter(String str){

        int counter[] = new int[256];

        for(int i =0; i <str.length(); i++){

            if(str.charAt(i)==' ')
                continue;
            counter[(int)  str.toLowerCase().charAt(i)]++;
        }
        for (int i=0; i < 256; i++){
            if (counter[i] !=0)
                System.out.println("Char "+(char)i + " ==> " +counter[i]);
        }
    }
}