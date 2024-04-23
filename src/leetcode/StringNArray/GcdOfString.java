package leetcode.StringNArray;

public class GcdOfString {

    public static void main(String[] args) {

        String str1 = "ABABAB", str2 = "ABAB";

        System.out.println(gcdOfString(str1,str2));
    }

    public  static String gcdOfString(String str1, String str2){
        String gcd="";
        if(str2.length() > str1.length())
            return gcdOfString(str2, str1);

        if(str2.equals(str1))
            return  str2;

        if(str1.startsWith(str2))
            return gcdOfString(str1.substring(str2.length()), str2);

        return gcd;
    }
}
