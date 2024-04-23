package Array;

public class SlidingWindow {


    public static void main(String[] args) {
        int[] num1 = {2,45,66,-19, 20,34,21,56};
        int[] num = {2,9,31,-4,21,7};
        System.out.println(maxSumSubArray(num,3));
    }

public static int maxSumSubArray(int[] a, int k){
    int wSum=0;
    int mSum=Integer.MIN_VALUE;


    for(int i =0; i <k; i++){
        wSum +=a[i];
    }

    for (int i=k; i < a.length; i++ ){
        wSum = wSum-a[i-k]+a[i];
        mSum=Math.max(wSum,mSum);
    }
    return mSum;
    }
}
