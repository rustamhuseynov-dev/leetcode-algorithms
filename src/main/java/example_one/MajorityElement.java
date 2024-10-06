package example_one;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int result = sortElement(nums);
        System.out.println(result);

    }

    private static int sortElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
