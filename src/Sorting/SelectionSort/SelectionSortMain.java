package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};

        System.out.println("Array After Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

        System.out.println();

        int tempMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > tempMin) {
                tempMin = array[i];
                for (int j = i; j < array.length; j++) {

                }
            }
        }

        System.out.println("Array Before Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });
    }
}
