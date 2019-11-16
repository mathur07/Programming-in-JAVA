package LeetCode.Easy.TwoSum;

import java.util.Scanner;

public class TwoSumMain {
    public static void main(String[] args) {
        int[] array = new int[]{11, 7, 11, 2};
        int target = 9;
        int[] result = new int[2];
        result = twoSum(array, target);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        outerLoop:
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break outerLoop;
                }
            }
        }

        return result;
    }
}
