package String;

public class ReverseVowels {

    public static void main(String[] args){

        String s = "Unglad, I tar a tidal gnu.";
        System.out.println(reverseVowels(s));
    }
    public static  String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int start=0;
        int end=s.length()-1;

        while(start < end) {

            if (!isVowel(ch[start]))
                start++;
            else if (!isVowel(ch[end]))
                end--;
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static  boolean isVowel(char c){

        if ( c =='a' ||c =='e' ||c =='i' ||c =='o' ||c =='u' ||c =='A' ||c =='E' ||c =='I'||c =='O'||c =='U' )
            return  true;
        else
            return  false;

    }
}
