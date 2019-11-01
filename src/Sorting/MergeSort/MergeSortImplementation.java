package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortImplementation {
    public static void main(String[] args) {
        int[] array = new int[]{};

        System.out.println("Array before Sorting! :");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });


        System.out.println("Array after Sorting! :");
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });
    }

    // Merge Sort Logic
    void split(int[] array) {

        int len = array.length;
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        if (len < 2) {
            return;
        }

        if (mid - 1 >= 0) {
            System.arraycopy(array, 0, left, 0, mid - 1);
        }

        if (len - 1 - mid >= 0) {
            System.arraycopy(array, mid, right, mid, len - 1 - mid);
        }

        split(left);
        split(right);

    }

    void merge(int[] left, int[] right,int[] Array){

    }
}
