package algoritms;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        String lowerCase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(lowerCase);
        boolean isPalindrome = lowerCase.equals(new StringBuilder(lowerCase).reverse().toString());
        System.out.println(isPalindrome);
    }
}
