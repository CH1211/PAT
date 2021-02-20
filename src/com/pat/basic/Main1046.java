package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/06
 * @description
 */
public class Main1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        int countA = 0;
        int countB = 0;
        while (count > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (a + c == b && a + c == d) {
                count--;
                continue;
            }

            if (a + c == b) {
                countB++;
            }
            if (a + c == d) {
                countA++;
            }
            count--;
        }
        System.out.println(countA + " " + countB);
    }
}
