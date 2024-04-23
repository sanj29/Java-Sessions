package ExceptionHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testMathOps {

    public static void main(String[] args) throws InterruptedException, IOException {

        int i=0;


        try {
            myExcetion.go();
            float div = 5 / i;
            System.out.println("div value:: "+div);

        }catch (myExcetion mex){
            mex.printStackTrace();
        }finally {

        System.out.println("in finally bock ");
        int mul = 9+5*i;
        System.out.println("Mul value:: "+mul);
        System.out.println("Sub value:: "+(mul-2));
        System.out.println("String Add value:: "+mul+2);
        System.out.println("Add value:: "+(mul+2));
        }


    }
}

