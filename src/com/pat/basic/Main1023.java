package com.pat.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/21
 * @description
 */
public class Main1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        int index = 0;
        while (index < 10) {
            number[index] = scanner.nextInt();
            index++;
        }
        StringBuilder sum = new StringBuilder();
        for (int i = 1; i < number.length; i++) {
            if (number[i] != 0) {
                sum.append(i);
                number[i]--;
                break;
            }
        }

        for (int j = 0; j < number.length; j++) {
            if (number[j] != 0) {
                while (number[j] > 0) {
                    sum.append(j);
                    number[j]--;
                }
            }
        }
        System.out.println(sum);
    }
}
