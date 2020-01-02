package LeetCode.Easy.ShortestUnsortedContinuousSubarray;

public class ShortestUnsortedContinuousSubarrayMain {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, 2, 2, 2};
        int[] nums = new int[]{1,2,3,4};
        int result;
        result = findUnsortedSubarray(nums);
        System.out.println("result = " + result);
    }

    private static int findUnsortedSubarray(int[] nums) {
        int min, max, min_i = -1, max_i = -1;
        min = nums[nums.length - 1];
        max = nums[0];


        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                min = nums[i];
                min_i = i;
                break;
            }

        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] > nums[i]) {
                max = nums[i];
                max_i = i;
                break;
            }

        }

        for (int i = min_i; i < max_i; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }

        }

        for (int i = 0; i < min_i; i++) {
            if (nums[i] >= min) {
                min_i = i;
            }

        }

        for (int i = nums.length - 1; i > max_i; i--) {
            if (nums[i] <= max) {
                max_i = i;
            }

        }

        if (max_i - min_i == 0) {
            return 0;
        } else {
            return max_i - min_i + 1;
        }
    }
}
