package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/11
 * @description
 */
public class Main1043 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] s = new int[6];
        String[] out = new String[]{"P", "A", "T", "e", "s", "t"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'P') {
                s[0]++;
            }
            if (str.charAt(i) == 'A') {
                s[1]++;
            }
            if (str.charAt(i) == 'T') {
                s[2]++;
            }
            if (str.charAt(i) == 'e') {
                s[3]++;
            }
            if (str.charAt(i) == 's') {
                s[4]++;
            }
            if (str.charAt(i) == 't') {
                s[5]++;
            }
        }
        int index = 0;
        while (s[0] > 0 || s[1] > 0 || s[2] > 0 || s[3] > 0 || s[4] > 0 || s[5] > 0) {
            if (s[index] > 0) {
                sb.append(out[index]);
                s[index]--;
            }
            index = (index + 1) % 6;
        }
        System.out.println(sb);
    }
}
