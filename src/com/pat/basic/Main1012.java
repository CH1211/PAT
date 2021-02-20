package com.pat.basic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/17
 * @description
 */
public class Main1012 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (count > 0) {
            list.add(scanner.nextInt());
            count--;
        }

        int a1 = 0, a2 = 0, a3 = 0, a5 = 0;
        double a4 = 0;
        int turn = 1;
        int a2_count = 0;
        int a4_count = 0;
        for (int i : list) {
            if (i % 5 == 0 && i % 2 == 0) {
                a1 += i;
            }
            if (i % 5 == 1) {
                a2 += turn * i;
                turn *= -1;
                a2_count++;
            }
            if (i % 5 == 2) {
                a3 += 1;
            }
            if (i % 5 == 3) {
                a4 += i;
                a4_count++;
            }
            if (i % 5 == 4) {
                if (i > a5) {
                    a5 = i;
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        if (a1 == 0) {
            res.add("N");
        } else {
            res.add(String.valueOf(a1));
        }
        if (a2_count == 0) {
            res.add("N");
        } else {
            res.add(String.valueOf(a2));
        }
        if (a3 == 0) {
            res.add("N");
        } else {
            res.add(String.valueOf(a3));
        }
        if (a4 == 0) {
            res.add("N");
        } else {
            String format = String.format("%.1f", a4 / a4_count);
            res.add(format);
        }
        if (a5 == 0) {
            res.add("N");
        } else {
            res.add(String.valueOf(a5));
        }

        System.out.println(res.stream().collect(Collectors.joining(" ")));

    }
}
