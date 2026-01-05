package algoritms;


import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] s1 = s.split(" ");
        System.out.println(result(s1));
    }

    private static String result(String[] s1) {
        int n = s1.length;
        String word = new String();
        for (int i = n - 1; i >= 0; i--) {
            word = word.concat(s1[i] + " ");
        }
        word = word.trim().replaceAll("\\s+", " ");;
        return word;
    }
}
