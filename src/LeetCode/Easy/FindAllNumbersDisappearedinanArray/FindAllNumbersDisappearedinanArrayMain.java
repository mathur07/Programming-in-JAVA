package LeetCode.Easy.FindAllNumbersDisappearedinanArray;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedinanArrayMain {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list;
        list = findDisappearedNumbers(nums);
        System.out.println("list = " + list);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<>();

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;

    }
}
