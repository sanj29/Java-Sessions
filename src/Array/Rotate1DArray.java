package Array;

public class Rotate1DArray {

    public static void main(String[] args) {
        int[] ar ={1,2,3,4,5};

        System.out.println(" Before rotating");
        for( int a : ar){
            System.out.print( a + " ");
         }
        rotateByN(ar,2);


        System.out.println(" After rotating \n");
        for( int a : ar){
            System.out.print( a + " ");
        }
    }

    // Rotate array by once//
    public static void rotateArrayOnce(int[] ary){

        int temp= ary[0];

        for(int i =1 ; i < ary.length ;i++){
            ary[i-1] = ary[i];
        }
        ary[ary.length-1]= temp;

    }

    /***
     * Rotate array by n number
     */
    public static  void rotateByN(int[] ar,int  k){

        if(k < 0)
            k=k+ar.length;
        else
            k= k%ar.length;

        /*for(int i =1 ; i <=k ; i++)
            rotateArrayOnce(ar);*/
        reverse(ar,0, k-1);
        reverse(ar,k, ar.length-1);
        reverse(ar,0, ar.length-1);


    }

    public static void reverse(int[] a, int start, int end){

        while (start <end){

            int temp = a[start];
            a[start] = a[end];
            a[end]= temp;
            start++;
            end --;
        }
    }

}
