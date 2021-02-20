package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/08
 * @description
 */
public class Main1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] res = new int[2 * num];
        for (int i = 1; i <= num; i++) {
            int index = (int) ((int) Math.floor((double) (i) / 2) + Math.floor((double) (i) / 3) + Math.floor((double) (i) / 5));
            res[index]++;
        }
        int count = 0;
        for (int j : res) {
            if (j != 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
