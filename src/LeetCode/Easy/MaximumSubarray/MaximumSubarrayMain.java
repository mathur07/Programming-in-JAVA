package LeetCode.Easy.MaximumSubarray;

public class MaximumSubarrayMain {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result;
        result = maxSubArray(nums);
        System.out.println("result = " + result);
    }

    private static int maxSubArray(int[] nums) {
        int max_value = nums[0], temp_value = 0;
        for (int value : nums) {
            if (temp_value < 0) {
                temp_value = 0;
            }

        }
        return max_value;
    }
}