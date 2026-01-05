package algoritms;

import java.util.Arrays;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        StringBuilder[] sb = new StringBuilder[numRows];
        String word = result(sb,numRows,s);
        System.out.println(word);
    }

    private static String result(StringBuilder[] sb, int numRows, String s) {
        if (numRows == 1) return s;
        int currentRow = 0;
        boolean goingDown = false;
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        for (char c : s.toCharArray()) {
            sb[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : sb) {
            res.append(row);
        }
        return res.toString();
    }
}
