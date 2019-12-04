package LeetCode.Easy.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementMain {

    private static int majorityElement(int[] nums) {
        int count = 0, max=-1;
        for (int num : nums) {
            if (count == 0) {
                max = num;
            }
            if (max == num) {
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
