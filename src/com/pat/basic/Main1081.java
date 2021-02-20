package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/02
 * @description
 */
public class Main1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] res = new String[count];
        int index = 0;
        scanner.nextLine();
        while (index < count) {
            String tmp = scanner.nextLine();
            if (tmp.length() < 6) {
                res[index] = "Your password is tai duan le.";
            } else {
                if (!tmp.matches("[a-zA-Z0-9.]+")) {
                    res[index] = "Your password is tai luan le.";
                } else if (tmp.matches("[a-zA-Z.]+")) {
                    res[index] = "Your password needs shu zi.";
                } else if (tmp.matches("[0-9.]+")) {
                    res[index] = "Your password needs zi mu.";
                } else {
                    res[index] = "Your password is wan mei.";
                }
            }
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(res[i]);
        }

    }
}
