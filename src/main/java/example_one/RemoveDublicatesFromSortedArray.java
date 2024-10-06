package example_one;

import java.util.Arrays;

public class RemoveDublicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int[] longNums = new int[]{0,0,1,1,1,1,2,3,3};
        //removeDublicateElement(nums);
        int i = removeDublicateElementToo(longNums);
        System.out.println(i);
    }

    private static int removeDublicateElementToo(int[] longNums) {
        int k=2;
        for (int i = 2; i < longNums.length; i++) {
            if (longNums[i] != longNums[k-2]){
                longNums[k] = longNums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(longNums));
        return k;
    }

    private static int removeDublicateElement(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
