package LeetCode.Easy.ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicateMain {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 1};
        boolean result;

        result = containsDuplicate(array);
        System.out.println("result = " + result);
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
