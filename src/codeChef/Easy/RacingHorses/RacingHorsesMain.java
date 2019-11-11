package codeChef.Easy.RacingHorses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RacingHorsesMain {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);

            int no_test_cases;
            no_test_cases = scan.nextInt();
            for (int i = 0; i < no_test_cases; i++) {
                int array_size = scan.nextInt();
                int[] array = new int[array_size];
                for (int j = 0; j < array_size; j++) {
                    array[j] = scan.nextInt();
                }
                Arrays.sort(array);
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < array_size - 1; j++) {
                    if (min > array[j + 1] - array[j]) {
                        min = array[j + 1] - array[j];
                    }
                }
                System.out.println(min);
            }

        } catch (Exception e) {
            return;
        }
    }
}
