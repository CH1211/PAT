package com.pat.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/03
 * @description
 */
public class Main1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int mul = a * b;
        String str = String.valueOf(mul);
        int[] tmp = new int[str.length()];

        int index = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(str.charAt(index)));
            index--;
        }

        int sum = 0;
        for (int i : tmp) {
            sum = sum * 10 + i;
        }

        int[] res = new int[String.valueOf(sum).length()];
        for (int k = 0; k < res.length; k++) {
            res[k] = Integer.parseInt(String.valueOf(String.valueOf(sum).charAt(k)));
        }

        for (int re : res) {
            System.out.print(re);
        }
        System.out.println();
    }
}
