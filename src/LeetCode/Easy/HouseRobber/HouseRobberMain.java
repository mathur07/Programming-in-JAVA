package LeetCode.Easy.HouseRobber;

import java.util.ArrayList;
import java.util.List;

public class HouseRobberMain {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        int result;
        result = rob(nums);
        System.out.println("result = " + result);
    }

    private static int rob(int[] nums) {
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (i % 2 == 1) {
                odd.add(nums[i]);
            } else {
                even.add(nums[i]);
            }
        }

        return 0;
    }
}
