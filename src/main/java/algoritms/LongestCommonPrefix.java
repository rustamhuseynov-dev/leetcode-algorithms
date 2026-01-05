package algoritms;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String result = result(str);
        System.out.println(result);
    }

    private static String result(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        
        if (str.length == 1) {
            return str[0];
        }

        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                System.out.println(str[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}