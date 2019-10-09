package codeChef;

import java.util.Scanner;

public class PhonePrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_test_cases = scan.nextInt();
        for (int i = 0; i < number_of_test_cases; i++) {
            int array_size = scan.nextInt();
            int[] arr = new int[array_size];
            for (int j = 0; j < array_size; j++) {
                arr[j] = scan.nextInt();
            }
            int minimum_price_count = 1;
            int iterator = 5;
            while (iterator < array_size) {
                int minimum_price = Integer.MAX_VALUE;
                for (int j = iterator - 5; j < iterator; j++) {
                    System.out.println("j = " + j);
                    if (arr[j] < minimum_price) {
                        minimum_price = arr[j];
                        System.out.println("minimum_price = " + minimum_price);
                    }
                }
                if (arr[iterator] <= minimum_price) {
                    System.out.println("arr[iterator] = " + arr[iterator]);
                    System.out.println("minimum_price = " + minimum_price);
                    minimum_price_count++;
                }
                iterator++;
            }
            System.out.println("minimum_price_count = " + minimum_price_count);
        }
    }
}
