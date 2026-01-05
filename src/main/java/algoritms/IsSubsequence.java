package algoritms;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        boolean result = result(s, t);
        System.out.println(result);
    }

    private static boolean result(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        
        int sIndex = 0;
        int tIndex = 0;
        
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        
        return sIndex == s.length();
    }
}