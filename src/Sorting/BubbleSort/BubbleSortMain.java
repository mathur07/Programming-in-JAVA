package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};
//        int[] array2 = {4, 8, 5, 1, 9, 6};

        System.out.println("Array Before Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

        System.out.println();

//        Binary Sort in Increasing Order
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Array After Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

    }
}
