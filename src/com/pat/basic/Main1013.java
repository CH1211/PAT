package com.pat.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/17
 * @description
 */
public class Main1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int count = 0, i = 2; count <= end; i++) {
            if (isPrime(i)) {
                count++;
                if (count >= start && count <= end) {
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % 10 == 9) {
                System.out.print(list.get(i));
                System.out.println();
            } else {
                System.out.print(list.get(i));
                if (i != list.size() - 1) {
                    System.out.print(" ");
                }
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
