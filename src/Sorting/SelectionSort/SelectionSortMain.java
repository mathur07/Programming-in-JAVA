package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};
//        int[] array = new int[]{7, 5, 4, 2, 1};

        System.out.println("Array After Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            int temp = Integer.MAX_VALUE;
            int minIndex = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (array[j] < temp) {
                    minIndex = j;
                    temp = array[j];
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Array Before Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

    }
}
