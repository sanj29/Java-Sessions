package Recurssion;

public class FiboRecu {

    public static void main(String[] args) {
    int n =10;
        System.out.println(" fibo of "+ n +" is :"+fibo(n));
    }

    public static int fibo (int n){

        if(n==1 || n==2)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
