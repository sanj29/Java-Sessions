package String;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String inputStr = "baabaabd";
        String result = longestPalindrome(inputStr);
        System.out.println(result); // Output: "bab" or "aba" is a valid answer
    }
    public static String longestPalindrome(String str){

        if(str == null || str.length()<1)
            return "";

        int start=0;
        int end=0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(str, i, i + 1); // Even length palindrome
            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
