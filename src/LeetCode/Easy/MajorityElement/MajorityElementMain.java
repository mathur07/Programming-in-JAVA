package LeetCode.Easy.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementMain {

    private static int majorityElement(int[] nums) {
        int count = 0, max=-1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                max = nums[i];
            }
            if (max == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 4};
        int result;
        result = majorityElement(nums);
        System.out.println("result = " + result);
    }

}
