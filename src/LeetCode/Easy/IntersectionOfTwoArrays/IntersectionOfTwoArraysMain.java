package LeetCode.Easy.IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysMain {
    public static void main(String[] args) {
        int[] result;
        int[] array1 = {4, 9, 5};
        int[] array2 = {9, 4, 9, 8, 4};

        result = intersect(array1, array2);

        for (int val : result) {
            System.out.println(val);
        }
    }

    private static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for (int key : nums1) {
            map.put(key, 0);
        }

        int temp;
        for (int num : nums2) {
            temp = map.get(num);
            temp++;
            map.put(num, temp);
        }

//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 0) {
//                temp = entry.getValue();
//                while (temp != 0) {
//                    array.add(entry.getKey());
//                    temp--;
//                }
//            }
//        }

        int[] retArray = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            retArray[i] = array.get(i);

        }

        return retArray;
    }
}
