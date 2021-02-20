package com.pat.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/03
 * @description
 */
public class Main1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(101);
        int count = scanner.nextInt();
        int[] nums = new int[101];
        scanner.nextLine();
        while (count > 0) {
            int tmp = scanner.nextInt();
            nums[tmp]++;
            count--;
        }

        int k = scanner.nextInt();
        while (k > 0) {
            int query = scanner.nextInt();
            System.out.print(nums[query]);
            if (k != 1) {
                System.out.print(" ");
            }
            k--;
        }
    }
}

