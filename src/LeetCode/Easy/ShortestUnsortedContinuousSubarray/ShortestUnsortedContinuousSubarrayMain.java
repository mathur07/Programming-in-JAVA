package LeetCode.Easy.ShortestUnsortedContinuousSubarray;

public class ShortestUnsortedContinuousSubarrayMain {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15, 20, 7};
        int result;
        result = findUnsortedSubarray(nums);
        System.out.println("result = " + result);
    }

    private static int findUnsortedSubarray(int[] nums) {
        int min, max, min_i, max_i;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i] && min > nums[i]) {
                min = nums[i];
            }
            if (nums[i - 1] > nums[i] && max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        return 0;
    }
}
