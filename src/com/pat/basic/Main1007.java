package com.pat.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/15
 * @description
 */
public class Main1007 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        for (int i = 0, j = 1; j < list.size(); i++, j++) {
            if (list.get(j) - list.get(i) == 2) {
                count++;
            }
        }
        System.out.println(count);
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
