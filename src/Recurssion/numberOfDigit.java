package Recurssion;

public class numberOfDigit {

    public static void main(String[] args) {

        int num  =123;
        System.out.println(numOfDigit(num));
    }

    public static int numOfDigit(int n){

        if(n==0)
            return 0;
       return numOfDigit(n/10)+1;
    }
}
