package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/03
 * @description
 */
public class Main1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i <= str.length - 2; i = i + 2) {
            if (Integer.parseInt(str[i + 1]) == 0) {
                num[i] = 0;
                num[i + 1] = 0;
            } else {
                num[i] = Integer.parseInt(str[i]) * Integer.parseInt(str[i + 1]);
                num[i + 1] = Integer.parseInt(str[i + 1]) - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j <= num.length - 2; j = j + 2) {
            if (num[j] != 0) {
                sb.append(num[j] + " " + num[j + 1] + " ");
            }
        }
        if (sb.length() == 0) {
            System.out.print("");
        } else {
            System.out.print(sb.substring(0, sb.length() - 1));
        }
    }
}
