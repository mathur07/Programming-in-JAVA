package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};
//        int[] array = new int[]{7, 5, 4, 2};

        System.out.println("Array After Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

        System.out.println();

        int tempMin;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (array[j] < array[j - 1]) {
                tempMin = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tempMin;
                j--;
                if (j == 0) {
                    break;
                }
            }
        }

        System.out.println("Array Before Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });
    }
}
