package Sorting.BucketSort;

import java.util.Arrays;

public class BucketSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};
//        int[] array = new int[]{7, 5, 4, 2, 1};

        System.out.println("Array After Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

        System.out.println("Array Before Sorting!");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });

    }
}
