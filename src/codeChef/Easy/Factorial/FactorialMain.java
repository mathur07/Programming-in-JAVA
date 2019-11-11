package codeChef.Easy.Factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) throws Exception {

        try {
            Scanner scan = new Scanner(System.in);
            int test_cases = scan.nextInt();

            for (int i = 0; i < test_cases; i++) {
                int temp, divisor = 5, count = 0;
                temp = scan.nextInt();
                while (temp / divisor != 0) {
                    count += temp / divisor;
                    divisor = divisor * 5;
                }

                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
        }


    }
}
