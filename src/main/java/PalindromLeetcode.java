import java.util.Arrays;

public class PalindromLeetcode {
    public static void main(String[] args) {
        String word = "babat";

        System.out.println(longestPalindrome(word));

    }

    public static String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int startLength = charArray.length;
        String concat = "";
        for (int i = 0; i < startLength; i++) {
            if (charArray[i] == charArray[startLength-1-i]){
                if (i < startLength-1-i){
                    concat = s.substring(i,startLength-1-i) + charArray[startLength-1-i];
                }
                else {
                    concat = s.substring(startLength-1-i,i) + charArray[startLength-1-i];
                }
            }
        }
        return concat;
    }
}
