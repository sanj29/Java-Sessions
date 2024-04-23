package Array;

public class CheckIfSorted {

    public static void main(String[] args) {

        int[] ar= {2,4,6,1,10,12,14};
        System.out.println(" is sorted " + isSorted(ar));
    }

    public static boolean isSorted(int[] a){

        for(int i =1 ; i < a.length-1; i++){
            if(a[i] < a[i-1])
                return false;
        }
        return  true;
    }
}
