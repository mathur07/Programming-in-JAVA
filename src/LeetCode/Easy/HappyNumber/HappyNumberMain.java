package LeetCode.Easy.HappyNumber;

public class HappyNumberMain {
    public static void main(String[] args) {

        int num = 19;
        boolean result;
        result = isHappy(num);
        System.out.println("result = " + result);

    }

    private static boolean isHappy(int num) {
        int sum = 0;
        try {
            while (true) {
                while (num > 0) {
                    sum += Math.pow(num % 10, 2);
                    num = num / 10;
                }
                num = sum;
                if (sum == 1) {
                    return true;
                } else {
                    sum = 0;
                }
            }
        } catch (Exception e) {
            return false;
        }

    }
}
