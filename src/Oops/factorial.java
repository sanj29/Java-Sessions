package Oops;

public class factorial {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(calculateFact(n));
    }


    public static  int  calculateFact(int n){

        if(n ==0) {
            return 1;
        }
        return (n*calculateFact(n-1));
    }
}
