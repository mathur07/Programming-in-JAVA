package LeetCode.Easy.BestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStockMain {


    private static int maxProfit(int[] array) {
        int result = -1, min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            result = Math.max(max, array[i] - min);
        }
        return result;
    }


    public static void main(String[] args) {
        int result;
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        result = maxProfit(array);

        System.out.println("result = " + result);
    }


}
