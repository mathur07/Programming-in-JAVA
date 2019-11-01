package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortImplementation {
    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 5, 1, 9, 6};

        System.out.println("Array before Sorting! :");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        merge_sort(array);

        System.out.println("Array after Sorting! :");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Merge Sort Logic
    private static void merge_sort(int[] array) {

        int len = array.length;
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        if (len < 2) {
            return;
        }

        System.arraycopy(array, 0, left, 0, mid);

        System.arraycopy(array, mid, right, 0, len - mid);

        merge_sort(left);
        merge_sort(right);
        merge(left, right, array);

    }

    private static void merge(int[] left, int[] right, int[] array) {

        int l = 0;
        int r = 0;
        int k = 0;

        while (l < left.length && r < right.length) {

            if (left[l] <= right[r]) {
                array[k] = left[l];
                l++;
            } else {
                array[k] = right[r];
                r++;
            }
            k++;
        }

        while (l < left.length) {
            array[k] = left[l];
            l++;
            k++;
        }

        while (r < right.length) {
            array[k] = right[r];
            r++;
            k++;
        }

    }
}
