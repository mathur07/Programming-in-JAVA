package LeetCode.Easy.BestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStockMain {


    private static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int result;
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        result = maxProfit(array);

        System.out.println("result = " + result);
    }


}
