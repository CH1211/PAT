package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/12/21
 * @description
 */
public class Main1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d_a = scanner.nextInt();
        int b = scanner.nextInt();
        int d_b = scanner.nextInt();

        int numberA = 0;
        int numberB = 0;
        int tmp = 0;
        while (a > 0) {
            tmp = a % 10;
            if (tmp == d_a) {
                numberA = numberA * 10 + tmp;
            }
            a = a / 10;
        }
        while (b > 0) {
            tmp = b % 10;
            if (tmp == d_b) {
                numberB = numberB * 10 + tmp;
            }
            b = b / 10;
        }
        System.out.println(numberA + numberB);
    }
}
