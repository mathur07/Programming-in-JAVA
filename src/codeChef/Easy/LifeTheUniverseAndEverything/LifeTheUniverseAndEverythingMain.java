package codeChef.Easy.LifeTheUniverseAndEverything;

import java.util.Scanner;

public class LifeTheUniverseAndEverythingMain {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            while (true) {
                int temp;
                temp = scan.nextInt();
                if (temp == 42) {
                    break;
                } else {
                    System.out.println(temp);
                }
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
