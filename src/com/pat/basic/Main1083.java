package com.pat.basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/28
 * @description
 */
public class Main1083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] res = new int[count];
        int index = 0;
        while (index < count) {
            int tmp = scanner.nextInt();
            res[Math.abs(index + 1 - tmp)]++;
            index++;
        }
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] >= 2) {
                System.out.println(String.valueOf(i) + " " + res[i]);
            }
        }
    }

}
