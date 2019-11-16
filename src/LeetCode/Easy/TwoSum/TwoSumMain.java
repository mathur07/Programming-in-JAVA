package LeetCode.Easy.TwoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        int[] result = new int[2];
        int[] map = new int[target+1];
        Arrays.fill(map,Integer.MIN_VALUE);

        for (int value : array) {
            if (value <= target) {
                map[value] = value;
                if (map[value] + map[abs(value - target)] == target) {
                    result[0] = value;
                    result[1] = abs(value - target);
                    break;
                }
            }
        }

        return result;
    }
}
