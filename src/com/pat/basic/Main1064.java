package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/10
 * @description
 */
public class Main1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] res = new int[37];
        scanner.nextLine();
        while (count > 0) {
            int num = scanner.nextInt();
            int sum = 0;
            String str = String.valueOf(num);
            for (int i = 0; i < str.length(); i++) {
                int tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += tmp;
            }
            res[sum] += 1;
            count--;
        }

        int n = 0;
        for (int j = 0; j < 37; j++) {
            if (res[j] != 0) {
                n += 1;
            }
        }
        System.out.println(n);
        int tag = 1;
        for (int j = 0; j < 37; j++) {
            if (res[j] != 0) {
                if (tag == 1) {
                    tag = 0;
                } else {
                    System.out.print(" ");
                }
                System.out.print(j);
            }
        }
    }
}
// 太慢了