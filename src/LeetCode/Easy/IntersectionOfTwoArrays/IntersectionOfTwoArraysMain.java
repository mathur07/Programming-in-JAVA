package LeetCode.Easy.IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysMain {
    public static void main(String[] args) {
        ArrayList<Integer> result;
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        result = intersect(array1, array2);

        for (int val : result) {
            System.out.println(val);

        }
    }

    private static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for (int key : nums1) {
            map.put(key, 0);
        }

        int temp;
        for (int num:nums2) {
            temp = map.get(num);
            map.put(num,temp++);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>0){
                array.add(entry.getKey());
            }
        }

        return array;
    }
}
