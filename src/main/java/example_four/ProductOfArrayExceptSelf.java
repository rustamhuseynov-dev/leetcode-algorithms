package example_four;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

        int[] prefix = prefix(nums);
        int[] suffix = suffix(nums);
        int[] result = arraysSum(prefix,suffix,nums);
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(result));
    }

    private static int[] arraysSum(int[] prefix, int[] suffix, int[] nums) {
        for (int i = 0; i < prefix.length; i++) {
            int sum = prefix[i] * suffix[i];
            nums[i] = sum;
        }
        return nums;
    }

    private static int[] suffix(int[] nums) {
        int n = reverseArray(nums).length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = 4;
        }
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }
        return reverseArray(answer);

    }

    private static int[] reverseArray(int[] nums) {
        int end = nums.length - 1;
        int start = 0;
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        return nums;
    }

    private static int[] prefix(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }
        return answer;
    }
}
