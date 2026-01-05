package algoritms;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height1 = {4,2,0,3,2,5};
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] leftMaxResult = leftPrefix(height, n, leftMax);
        int[] rightMaxResult = rightPrefix(rightMax, n, height);
        System.out.println(result(leftMaxResult,rightMaxResult,n,height));
        System.out.println("left : " +Arrays.toString(leftMaxResult));
        System.out.println("right : " + Arrays.toString(rightMaxResult));
        System.out.println("height : " +Arrays.toString(height));

    }

    private static int result(int[] leftMaxResult, int[] rightMaxResult, int n, int[] height1) {
        int water = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(leftMaxResult[i], rightMaxResult[i]);
            water += min - height1[i];
        }
        return water;

    }

    private static int[] rightPrefix(int[] rightMax, int n, int[] height) {
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        return rightMax;
    }

    private static int[] leftPrefix(int[] height, int n, int[] leftMax) {
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        return leftMax;
    }
    
}
