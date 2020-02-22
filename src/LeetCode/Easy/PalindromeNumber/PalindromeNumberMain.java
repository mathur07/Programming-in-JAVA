package LeetCode.Easy.PalindromeNumber;

public class PalindromeNumberMain {
    public static void main(String[] args) {
        int number = 121;
        boolean result;
        result = isPalindrome(number);
        System.out.println("result = " + result);

    }

    private static boolean isPalindrome(int number) {
        int pal_num = 0;
        int temp_num = number;
        if (number < 0) {
            return false;
        } else {
            while (temp_num != 0) {
                pal_num = pal_num * 10 + temp_num % 10;
                temp_num /= 10;
            }
            return pal_num == number;
        }
    }
}
