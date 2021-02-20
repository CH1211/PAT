package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/19
 * @description
 */
public class Main1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kind = scanner.nextInt();
        int city = scanner.nextInt();
        int[] num = new int[kind];
        int max = 0;
        while (city > 0) {
            scanner.nextLine();
            int index = 0;
            while (index < kind) {
                num[index] += scanner.nextInt();
                if (num[index] > max) {
                    max = num[index];
                }
                index++;
            }
            city--;
        }
        System.out.println(max);
        StringBuilder str = new StringBuilder("");
        int tag = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max && tag == 0) {
                str.append(i + 1);
                tag = 1;
                continue;
            }
            if (num[i] == max && tag == 1) {
                str.append(" ");
                str.append(i + 1);
            }
        }
        System.out.println(str);
    }
}
