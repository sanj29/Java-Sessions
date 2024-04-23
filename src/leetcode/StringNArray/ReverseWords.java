package leetcode.StringNArray;

public class ReverseWords {

    public static void main(String[] args) {
        String s =" a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        String[] str =s.split(" ");
        String rev="";

        if(str.length==1)
            return s;

        for(int i=str.length-1; i >=0; --i){

            if(str[i].equals(" "))
                continue;
            else
                rev=rev+str[i] +" ";

        }

        return rev.trim();
    }
}
