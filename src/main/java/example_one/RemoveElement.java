package example_one;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int value = 3;
        int result = removeElement(nums,value);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int value) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
