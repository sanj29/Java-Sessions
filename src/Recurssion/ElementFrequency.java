package Recurssion;

public class ElementFrequency {

    public static void main(String[] args) {
         int [] ar = {10,10,20,30,30,30,40,50,40};

        findFrequency(ar);
    }

    /*** Finding The Frequency Of Elements In A Sorted Array
     *
      * @param ary
     */
    public static void findFrequency(int[] ary){

        int freq=1;
        int i=1;
        while (i <ary.length){
            while (i <ary.length && ary[i] == ary[i-1]) {
                freq++;
                i++;
            }
            System.out.println(ary[i-1] +" "+ freq);
            freq=1;
            i++;
        }

        if(ary[i-1] != ary[i-2]){
            System.out.println(ary[i-1] +" "+ freq);
        }

    }
}
