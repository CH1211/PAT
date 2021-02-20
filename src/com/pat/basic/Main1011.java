package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/09
 * @description
 */
public class Main1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] res = new String[count];
        int index = 0;
        while (index < count) {
            String[] str = br.readLine().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            Long c = Long.parseLong(str[2]);

            if (a + b > c) {
                res[index] = "true";
            } else {
                res[index] = "false";
            }
            index++;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + res[i]);
        }
    }
}
