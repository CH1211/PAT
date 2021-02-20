package com.pat.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/16
 * @description
 */
public class Main1008 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int num = scanner.nextInt();
        int index = 0;
        int[] res = new int[length];
        while (index < length) {
            int tmp = scanner.nextInt();
            if (index + num > length - 1) {
                res[num + index - length] = tmp;
                index++;
                continue;
            }
            res[index + num] = tmp;
            index++;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
