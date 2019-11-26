package LeetCode.Easy.SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberMain {

    private static int singleNumber(int[] array) {
        int result = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int value : array) {
            if (map.get(value) == null) {
                map.putIfAbsent(value, 1);
            } else {
                map.put(value, 2);
            }
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }


        return result;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 2, 1, 1};
        int result;
        result = singleNumber(array);
        System.out.println("result = " + result);
    }

}
