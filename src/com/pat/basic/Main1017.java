package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/29
 * @description
 */
public class Main1017 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int b = Integer.parseInt(str[1]);
        int tmp = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str[0].length(); i++) {
            tmp = tmp * 10 + str[0].charAt(i) - '0';
            sb.append((char) (tmp / b + '0'));
            tmp = tmp % b;
        }

        String result = sb.toString();

        if (result.charAt(0) == '0' && result.length() != 1) {
            System.out.print(result.substring(1) + " " + tmp);
        } else {
            System.out.print(result + " " + tmp);
        }
    }
}
