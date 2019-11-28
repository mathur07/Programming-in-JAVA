package LeetCode.Easy.BestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStockMain {


    private static int maxProfit(int[] array) {
        int result = -1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] - array[i] > result && array[i] < array[j]) {
                    result = array[j] - array[i];
                }
            }
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
