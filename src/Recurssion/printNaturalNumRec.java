package Recurssion;

public class printNaturalNumRec {

    public static void main(String[] args) {
        printNum( 10);
    }
    public static void printNum(int n){
        if(n==0)
            return;

        // System.out.print(n +" "); reverse print
        printNum(n-1);
        System.out.print(n +" "); // forward print

    }
}
