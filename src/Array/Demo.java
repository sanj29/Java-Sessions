package Array;

public class Demo{

    public static void main (String[] args){

        int[] a = {1,2,3,4,5};
        getDivionArray(a);
    }

    public static int[] getDivionArray(int[] ar){

        int[] res= new int[ar.length];
        int mul=1;
        int l=0, r=ar.length-1;
        for(int i=0; i<ar.length; i++){
            mul=mul*ar[i];
        }

        while(l < r){
            res[0]=mul;
            l++;
            res[l]=(mul/ar[l]);
        }
        for(int n: res)
            System.out.print(n + " ");

        return res;
    }
}