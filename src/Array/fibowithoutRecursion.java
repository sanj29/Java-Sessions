package Array;

public class fibowithoutRecursion {

    public static void main(String[] args) {

        printFibonacciSeries(10);
    }
    public static  void printFibonacciSeries(int n ){

        long first =1, second =1;
        for (int i=0; i <n ; i++){

            if (i==0)
                System.out.print(first +" ");
            else if(i==1)
                System.out.print(second +" ");
            else {

                long next =first+second;
                first=second;
                second= next;
                System.out.print(next+ " ");
            }
        }
    }
}
