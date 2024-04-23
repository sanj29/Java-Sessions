package programs;

import java.util.Scanner;

public class Alpha {

    public static void main(String[] args) {

        System.out.println("Enter number ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(trailingZeros(num));
    }

    public static  int trailingZeros(int num){
        int powOf5=5;
        int res=0;

        while(num >=powOf5){

        res =res+ (num/powOf5);
        powOf5 = powOf5*5;

        }
        return res;
    }
}
