package com.pat.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/04
 * @description
 */
public class Main1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int scope = scanner.nextInt();
        int[] res = new int[n];
        int line = 0;
        while (line < n) {
            scanner.nextLine();
            int index = 0;
            int teacher = 0;
            int sum = 0;
            int max = 0;
            int min = scope;
            int count = 0;
            while (index < n) {
                int tmp = scanner.nextInt();
                if (tmp < 0 || tmp > scope) {
                    index++;
                    continue;
                }
                if (index == 0) {
                    teacher = tmp;
                } else {
                    if (max < tmp) {
                        max = tmp;
                    }
                    if (min > tmp) {
                        min = tmp;
                    }
                    sum += tmp;
                    count++;
                }
                index++;
            }
            res[line] = Math.round(((float) teacher + (float) (sum - max - min) / (count - 2)) / 2);
            line++;
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}
