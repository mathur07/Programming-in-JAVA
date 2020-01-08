package LeetCode.Easy.firstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAStringMain {
    public static void main(String[] args) {
        String str = "cc";
        int result;
        result = firstUniqChar(str);
        System.out.println("result = " + result);
    }

    private static int firstUniqChar(String s) {
        if (s.length() == 0) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (Map.Entry<Character, Integer> temp : map.entrySet()) {
            if (temp.getValue() < min && temp.getValue() > -1) {
                min = temp.getValue();
                flag = true;
            }
        }
        if (flag) {
            return min;
        } else {
            return -1;
        }

    }
}
