package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/04
 * @description
 */
public class Main1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        int index = 0;
        while (index < count) {
            nums[index] = scanner.nextInt();
            index++;
        }
        int sum = 0;
        for (int i : nums) {
            for (int j : nums) {
                if (i != j) {
                    int tmp = i * 10 + j;
                    sum += tmp;
                }
            }
        }
        System.out.println(sum);
    }
}
