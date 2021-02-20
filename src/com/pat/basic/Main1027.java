package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/12/21
 * @description
 */
public class Main1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String tag = scanner.next();
        int total = 1;
        int step = 1;
        int line = 1;
        while (total <= num) {
            step += 2;
            total += step * 2;
            line++;
        }

        int used = 0;
        for (int i = 0; i < line - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < step - 2; j++) {
                System.out.print(tag);
            }
            System.out.println();
            step -= 2;
            used += step;
        }

        for (int i = line - 3; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < step + 2; j++) {
                System.out.print(tag);
            }
            System.out.println();
            step += 2;
            used += step;
        }
        System.out.print(num - used);
    }
}
