package example_three;

public class JumpGameToo {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        int b = canJump(nums);
        System.out.println(b);
    }

    private static int canJump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
