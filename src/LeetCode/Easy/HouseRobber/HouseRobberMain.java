package LeetCode.Easy.HouseRobber;

public class HouseRobberMain {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 4, 1};
        int result;
        result = rob(nums);
        System.out.println("result = " + result);
    }

    private static int rob(int[] nums) {

        int[] temp_array = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Integer.max(nums[0], nums[1]);
        }

        temp_array[0] = nums[0];
        temp_array[1] = nums[1];

        for (int i = 2; i < temp_array.length; i++) {
            temp_array[i] = nums[i] + temp_array[i - 2];
        }


        return Integer.max(temp_array[temp_array.length - 1], temp_array[temp_array.length - 2]);
    }
}