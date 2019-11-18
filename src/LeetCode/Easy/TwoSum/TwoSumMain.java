package LeetCode.Easy.TwoSum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.StrictMath.abs;

public class TwoSumMain {
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 15, 2};
        int target = 9;
        int[] result = new int[2];
        result = twoSum(array, target);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] twoSum(int[] array, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(target - array[i]) != null) {
                return new int[]{i, map.get(target - array[i])};
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{-1, -1};

    }
}
