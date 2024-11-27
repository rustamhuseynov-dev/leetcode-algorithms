package example_four;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = new int[]{3,0,6,1,5};
        Arrays.sort(citations);
        int result = h_index(citations);
        System.out.println(result);
    }

    private static int h_index(int[] citations) {
        int n = citations.length - 1;
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > n - i) {
                count++;
            }
        }
        return count;
    }
}

