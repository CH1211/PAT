package com.pat.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/20
 * @description
 */
public class Main1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] num = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int tmp = (int) str.charAt(i);
            if (tmp >= 97 && tmp < 122) {
                num[tmp - 97]++;
            }
            if (tmp >= 65 && tmp < 90) {
                num[tmp - 65]++;
            }
        }
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                res.append(i + 97);
                break;
            }
        }
        System.out.println((char) Integer.parseInt(String.valueOf(res)) + " " + max);
    }
}
