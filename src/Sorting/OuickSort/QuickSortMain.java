package Sorting.OuickSort;

public class QuickSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{4, 8, 5, 1, 9, 6};

        System.out.println("Array before Sorting : ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        quickSort(array);

        System.out.println("Array after Sorting : ");
        for (int value : array) {
            System.out.printf(value + " ");
        }

    }

    private static void quickSort(int[] array) {
        int i = -1;
        int j = 0;
        int k = array.length - 1;

    }
}
