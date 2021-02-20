package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/09
 * @description
 */
public class Main1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int[] res = new int[10];
        for (int i = 0; i < num.length(); i++) {
            res[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (res[i] != 0) {
                System.out.println(i + ":" + res[i]);
            }
        }
    }
}

// 注意题目中给出的整数范围，有可能表示不了，用字符串来解决