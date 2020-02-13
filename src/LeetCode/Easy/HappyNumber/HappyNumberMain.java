package LeetCode.Easy.HappyNumber;

import java.util.HashSet;

public class HappyNumberMain {
    public static void main(String[] args) {

        int num = 19;
        boolean result;
        result = isHappy(num);
        System.out.println("result = " + result);

    }

    private static boolean isHappy(int num) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (num != 0) {
                sum += Math.pow(num % 10, 2);
                num /= 10;
            }

            if (set.contains(sum)) {
                return false;
            }
            if (sum == 1) {
                return true;
            } else {
                set.add(sum);
            }
            num = sum;
        }
    }
}
