package algoritms;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(result(s));
    }

    private static int result(String s) {
        String string = s.trim();
        String s1 = string.split(" ")[string.split(" ").length - 1];
        return s1.length();
    }
}
