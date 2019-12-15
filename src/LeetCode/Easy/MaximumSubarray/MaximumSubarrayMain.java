package LeetCode.Easy.MaximumSubarray;

public class MaximumSubarrayMain {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result;
        result = maxSubArray(nums);
        System.out.println("result = " + result);
    }

    private static int maxSubArray(int[] nums) {
        int max_value = nums[0], temp_value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp_value = Integer.max(nums[i], temp_value + nums[i]);
            if (temp_value > max_value) {
                max_value = temp_value;
            }
        }
        return max_value;
    }
}