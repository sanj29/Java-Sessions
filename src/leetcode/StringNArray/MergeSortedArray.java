package leetcode.StringNArray;

public  class MergeSortedArray {

    public static void main(String[] args) {

        String w1= "ab";
        String w2="pqrs";
        mergeAlternately(w1,w2);
    }

    public static String  mergeAlternately(String word1, String word2) {

        int m=word1.length();
        int n=word2.length();

        int i=0;
        int j=0;
        String res="";
        while(i <m || j <n){

            if(i<m){
                res = res+word1.charAt(i);
                i++;
            }
            if(j <n) {
                res = res + word2.charAt(j);
                j++;
            }

        }
        //System.out.println(res);
        return  res;
    }
}