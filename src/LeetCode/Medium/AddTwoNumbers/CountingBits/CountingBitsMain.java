package LeetCode.Medium.AddTwoNumbers.CountingBits;


public class CountingBitsMain {
    public static void main(String[] args) {
        int num = 5;
        int[] result;
        result = countBits(num);
        for (int number:result) {
            System.out.print(number + " ");
        }
    }

    private static int[] countBits(int num) {


        return new int[num+1];

    }
}
