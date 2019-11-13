package codeChef.Easy.UncleJohny;

import java.util.Scanner;

public class UncleJohnyMain {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int number_of_test_cases;
            number_of_test_cases = scan.nextInt();

            for (int i = 0; i < number_of_test_cases; i++) {
                int array_size,k;
                array_size=scan.nextInt();
                int[] array = new int[array_size];
                for (int j = 0; j < array_size; j++) {
                    array[i]=scan.nextInt();
                }
                k=scan.nextInt();
            }

        } catch (Exception e) {
            return;
        }
    }
}
