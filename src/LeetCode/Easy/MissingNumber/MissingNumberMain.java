package LeetCode.Easy.MissingNumber;

public class MissingNumberMain {
    public static void main(String[] args) {
        int[] array = new int[]{3, 0, 1};
        int result = missingNumber(array);
        System.out.println("result = " + result);
    }

    private static int missingNumber(int[] nums) {

//        int[] array = new int[nums.length+1];
//
//        for (int num : nums) {
//            array[num] = 1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                return i;
//            }
//        }
//        return -1;


        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int value : nums) {
            sum = sum + value;

        }

        return total - sum;
    }
}
