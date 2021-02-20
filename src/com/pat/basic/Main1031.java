package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/20
 * @description
 */
public class Main1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] str = new String[num];
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] M = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int index = 0;
        int tag = 0;
        int worry = 0;
        scanner.nextLine();
        while (index < num) {
            int loop = 0;
            String tmp = scanner.nextLine();
            int sum = 0;
            for (int i = 0; i <= 16; i++) {
                if ((int) tmp.charAt(i) < 48 || (int) tmp.charAt(i) > 57) {
                    str[worry] = tmp;
                    worry++;
                    loop = 1;
                } else {
                    sum += Integer.parseInt(String.valueOf(tmp.charAt(i))) * weight[i];
                }
            }
            if (loop == 1) {
                index++;
                continue;
            }
            if (M[sum % 11] == tmp.charAt(17)) {
                tag++;
            } else {
                str[worry] = tmp;
                worry++;
            }
            index++;
        }

        if (tag == num) {
            System.out.println("All passed");
        } else {
            for (int i = 0; i < worry; i++) {
                System.out.println(str[i]);
            }
        }
    }
}
