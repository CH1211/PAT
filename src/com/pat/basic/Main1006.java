package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/15
 * @description
 */
public class Main1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder str = new StringBuilder();
        int tag = 0;
        while (num > 0) {
            int tmp = num % 10;
            if (tag == 0) {
                for (int i = 1; i <= tmp; i++) {
                    str.append(i);
                }
            } else if (tag == 1) {
                for (int i = 1; i <= tmp; i++) {
                    str.insert(0, "S");
                }
            } else {
                for (int i = 1; i <= tmp; i++) {
                    str.insert(0, "B");
                }
            }
            tag++;
            num = num / 10;
        }
        System.out.println(str);
    }
}
