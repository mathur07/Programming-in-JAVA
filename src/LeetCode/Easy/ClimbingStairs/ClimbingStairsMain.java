package LeetCode.Easy.ClimbingStairs;

public class ClimbingStairsMain {


    private static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] tableArray = new int[n];
        tableArray[0] = 1;
        tableArray[1] = 2;

        for (int i = 2; i < n; i++) {
            tableArray[i] = tableArray[i - 1] + tableArray[i - 2];
        }

    return tableArray[n-1];
    }

    public static void main(String[] args) {
        int n = 5, result;
        result = climbStairs(n);
        System.out.println("result = " + result);
    }
}
