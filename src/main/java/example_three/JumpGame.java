package example_three;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        boolean b = canJump(nums);
        System.out.println(b);
    }

    private static boolean canJump(int[] nums) {
        int a = nums[0];
        int b = nums[a];
        int endElement = nums[nums.length - 2];
        System.out.println(nums[b+1]);
        if (nums[b+1] == endElement){
            return true;
        }else {
            return false;
        }
    }
}
