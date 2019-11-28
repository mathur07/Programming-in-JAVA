package LeetCode.Easy.MoveZeroes;

import java.util.stream.Stream;

public class MoveZeroesMain {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1};
        int[] result;
        result = moveZeroes(array);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] moveZeroes(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
