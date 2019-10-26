package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};
        int[] array2 = {4, 8, 5, 1, 9, 6};


        Arrays.stream(array).forEach(i -> {
            System.out.println("array = " + i);
        });
        Arrays.stream(array2).forEach(i -> {
            System.out.println("array2 = " + i);
        });

    }
}
