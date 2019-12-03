package LeetCode.Easy.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementMain {


    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.get(num) != null) {
                int value = hashMap.get(num);
                value++;
                hashMap.put(num, value);
            } else {
                hashMap.put(num, 1);
            }
        }
        int max_value = Integer.MIN_VALUE;
        for (int value : hashMap.values()) {
            if (value > max_value) {
                max_value = value;
            }
        }
        return max_value;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int result;
        result = majorityElement(nums);
        System.out.println("result = " + result);
    }

}
